package com.geon.bis.link.tago.config;

import datex.Datex;
import datex.iso14827_2.Time;
import com.oss.asn1.Coder;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

@Slf4j
@Getter
@Component
public class Util {

	private final TagoServerConfig tagoServerConfig;
	private final Coder coder;



	
	public Util(TagoServerConfig tagoServerConfig) {
        this.tagoServerConfig = tagoServerConfig;
        coder = Datex.getBERCoder();
		coder.enableAutomaticEncoding(); // for OpenType
		coder.enableAutomaticDecoding(); // for OpenType
		coder.disableContainedValueDecoding();
		coder.disableContainedValueEncoding();
		coder.disableDecoderConstraints();
		coder.disableEncoderConstraints();
		//coder.enableEncoderDebugging();
		//coder.enableDecoderDebugging();
	}
	
	
	/**
	 * Get CRC16 code
	 * @param Input data
	 * @return CRC16
	 */
	public byte[] getCrc16(byte[] bytes) {

		int[] table = {
				0x0000, 0xC0C1, 0xC181, 0x0140, 0xC301, 0x03C0, 0x0280, 0xC241,
				0xC601, 0x06C0, 0x0780, 0xC741, 0x0500, 0xC5C1, 0xC481, 0x0440,
				0xCC01, 0x0CC0, 0x0D80, 0xCD41, 0x0F00, 0xCFC1, 0xCE81, 0x0E40,
				0x0A00, 0xCAC1, 0xCB81, 0x0B40, 0xC901, 0x09C0, 0x0880, 0xC841,
				0xD801, 0x18C0, 0x1980, 0xD941, 0x1B00, 0xDBC1, 0xDA81, 0x1A40,
				0x1E00, 0xDEC1, 0xDF81, 0x1F40, 0xDD01, 0x1DC0, 0x1C80, 0xDC41,
				0x1400, 0xD4C1, 0xD581, 0x1540, 0xD701, 0x17C0, 0x1680, 0xD641,
				0xD201, 0x12C0, 0x1380, 0xD341, 0x1100, 0xD1C1, 0xD081, 0x1040,
				0xF001, 0x30C0, 0x3180, 0xF141, 0x3300, 0xF3C1, 0xF281, 0x3240,
				0x3600, 0xF6C1, 0xF781, 0x3740, 0xF501, 0x35C0, 0x3480, 0xF441,
				0x3C00, 0xFCC1, 0xFD81, 0x3D40, 0xFF01, 0x3FC0, 0x3E80, 0xFE41,
				0xFA01, 0x3AC0, 0x3B80, 0xFB41, 0x3900, 0xF9C1, 0xF881, 0x3840,
				0x2800, 0xE8C1, 0xE981, 0x2940, 0xEB01, 0x2BC0, 0x2A80, 0xEA41,
				0xEE01, 0x2EC0, 0x2F80, 0xEF41, 0x2D00, 0xEDC1, 0xEC81, 0x2C40,
				0xE401, 0x24C0, 0x2580, 0xE541, 0x2700, 0xE7C1, 0xE681, 0x2640,
				0x2200, 0xE2C1, 0xE381, 0x2340, 0xE101, 0x21C0, 0x2080, 0xE041,
				0xA001, 0x60C0, 0x6180, 0xA141, 0x6300, 0xA3C1, 0xA281, 0x6240,
				0x6600, 0xA6C1, 0xA781, 0x6740, 0xA501, 0x65C0, 0x6480, 0xA441,
				0x6C00, 0xACC1, 0xAD81, 0x6D40, 0xAF01, 0x6FC0, 0x6E80, 0xAE41,
				0xAA01, 0x6AC0, 0x6B80, 0xAB41, 0x6900, 0xA9C1, 0xA881, 0x6840,
				0x7800, 0xB8C1, 0xB981, 0x7940, 0xBB01, 0x7BC0, 0x7A80, 0xBA41,
				0xBE01, 0x7EC0, 0x7F80, 0xBF41, 0x7D00, 0xBDC1, 0xBC81, 0x7C40,
				0xB401, 0x74C0, 0x7580, 0xB541, 0x7700, 0xB7C1, 0xB681, 0x7640,
				0x7200, 0xB2C1, 0xB381, 0x7340, 0xB101, 0x71C0, 0x7080, 0xB041,
				0x5000, 0x90C1, 0x9181, 0x5140, 0x9301, 0x53C0, 0x5280, 0x9241,
				0x9601, 0x56C0, 0x5780, 0x9741, 0x5500, 0x95C1, 0x9481, 0x5440,
				0x9C01, 0x5CC0, 0x5D80, 0x9D41, 0x5F00, 0x9FC1, 0x9E81, 0x5E40,
				0x5A00, 0x9AC1, 0x9B81, 0x5B40, 0x9901, 0x59C0, 0x5880, 0x9841,
				0x8801, 0x48C0, 0x4980, 0x8941, 0x4B00, 0x8BC1, 0x8A81, 0x4A40,
				0x4E00, 0x8EC1, 0x8F81, 0x4F40, 0x8D01, 0x4DC0, 0x4C80, 0x8C41,
				0x4400, 0x84C1, 0x8581, 0x4540, 0x8701, 0x47C0, 0x4680, 0x8641,
				0x8201, 0x42C0, 0x4380, 0x8341, 0x4100, 0x81C1, 0x8081, 0x4040,
		};

		int crc = 0x0000;
		for (byte b : bytes) {
			crc = (crc >>> 8) ^ table[(crc ^ b) & 0xff];
		}

		// logger.trace("CRC16 = " + Integer.toHexString(crc));

		// return crc;
		return shortToBytes((short) crc, 1);
	}
	
	private byte[] shortToBytes(short Value, int Order) {
		byte[] temp;
		temp = new byte[] { (byte) ((Value & 0xFF00) >> 8), (byte) (Value & 0x00FF) };
		temp = changeByteOrder(temp, Order);
		return temp;
	}

	private byte[] changeByteOrder(byte[] value, int Order) {
		int idx = value.length;
		byte[] Temp = new byte[idx];

		// BIG_ENDIAN
		if (Order == 1) {
			Temp = value;
		}
		// LITTLE_ENDIAN
		else if (Order == 0) {
			for (int i = 0; i < idx; i++) {
				Temp[i] = value[idx - (i + 1)];
			}
		}
		return Temp;
	}
	
	/**
	 * 현재시간을  ASN.1 Time 타입으로 얻어온다. 
	 * @return
	 */
	public Time getCurrentAsnTime() {
		Calendar cal = Calendar.getInstance();

		Time time = new Time();

		time.setTime_Year_qty(cal.get(Calendar.YEAR));
		time.setTime_Month_qty(cal.get(Calendar.MONTH) + 1);
		time.setTime_Day_qty(cal.get(Calendar.DATE));
		time.setTime_Hour_qty(cal.get(Calendar.HOUR_OF_DAY));
		time.setTime_Minute_qty(cal.get(Calendar.MINUTE));
		time.setTime_Second_qty(cal.get(Calendar.SECOND));
		time.setTime_SecondFractions(Time.Time_SecondFractions.createTime_SecondFractionsWithMilliseconds(cal
				.get(Calendar.MILLISECOND)));

		return time;
	}
	
	/**
	 * 문자열로 구성된 숫자를 INT 로 변형, 타입변경 오류시 -1 응답
	 * @return int
	 */
	public int TextToInt(String numberString) {
		int number = -1;
		
		try {
            number = Integer.parseInt(numberString);           
        } catch (NumberFormatException e) {
        	number = -1;
        }
		
		return number;
	}
	
	/**
	 * 문자열로 구성된 날짜를 timestamp 로 변형, 타입변경 오류시 00시00분으로 응답
	 * @return Timestamp
	 */
	public Timestamp TextToTimestamp(String dateString) {
		Timestamp timestamp = null;
		
		if(dateString == null) {
			dateString = "20240101000000";
		}
		
		try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            Date parsedDate = dateFormat.parse(dateString);
            
            timestamp = new Timestamp(parsedDate.getTime());
            
        } catch (ParseException e) {
        	LocalDateTime now = LocalDateTime.now();
        	LocalDateTime midnight = now.withHour(0).withMinute(0).withSecond(0).withNano(0);
        	timestamp = Timestamp.valueOf(midnight);
        }
		
		return timestamp;
	}
	
	/**
	 * 현재 시간을 timestamp 객체로 생성
	 * @return Timestamp
	 */
	public Timestamp nowTime() {
		long currentTimeMillis = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(currentTimeMillis);
		
		return timestamp;
	}
	
	/**
	 * timestamp를 문자열 형식으로 변경(yyyyMMddHHmmss)
	 * @return String
	 */
	public String TimeToString(Timestamp timestamp) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String timestampString = dateFormat.format(timestamp);

        return timestampString;
	}
	
	/**
	 * 입력 시간문자열에서 timestamp 형태로 변경
	 * @return Timestamp
	 */
	public Timestamp StringToTime(String dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date parsedDate=null;
		try {
			parsedDate = dateFormat.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
        Timestamp timestamp = new Timestamp(parsedDate.getTime());

        return timestamp;
	}
	
	/**
	 * byte[]값을 16진수로 변환하여 출력한다.(로그레벨이 Trace일 경우 동작)
	 * @param title
	 * @param coded
	 */
	public void printHex(String title, byte[] coded) {
		if (log.isTraceEnabled()) {
			String str = title + "\n";
			String hexDigits = "0123456789ABCDEF";

			for (int i = 0; i < coded.length; i++) {
				int c = coded[i];
				if (c < 0)
					c += 256;
				int hex1 = c & 0xF;
				int hex2 = c >> 4;
				str += hexDigits.substring(hex2, hex2 + 1);
				str += hexDigits.substring(hex1, hex1 + 1);

				if ((i + 1) % 5 == 0)
					str += " ";

				if ((i + 1) % 40 == 0)
					str += "\n";
			}
			log.trace(str);
		}
	}



	private int dataPacketNumber = 0;
	public int getDataPacketNumber() {
		return dataPacketNumber++;
	}

	private long subSerialNbr = 0;
	public long getSubSerialNbr() {
		return subSerialNbr++;
	}

	private long pubSerialNbr = 0;
	public long getPubSerialNbr() {
		return pubSerialNbr++;
	}

	@Getter
	@Value("${server.datagram-size}")
	private int dataGramSize;
}
