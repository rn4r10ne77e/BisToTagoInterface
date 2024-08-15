/*************************************************************/
/* Copyright (C) 2019 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED.
 * THIS COPYRIGHT STATEMENT MAY NOT BE REMOVED. */

/* Generated for: Korea Transportation Safety Authority - Site-based, License 17278 17278,
 * at 17, Hyeoksin 6-ro, Gimcheon-si, Gyeongsangbuk-do, South Korea. */
/* Abstract syntax: datex */
/* ASN.1 Java project: datex.Datex */
/* Created: Tue Feb 19 14:47:06 2019 */
/* ASN.1 Compiler for Java version: 7.2 */
/* ASN.1 compiler options and file names specified:
 * -output datex -ber -root -noSampleCode -messageFormat msvc D:/asn/datex.asn
 */


package datex.businfomation;

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type ArrivalPredictionTimeInfo from ASN1 Module BusInfomation.
 * @see Sequence
 */

public class ArrivalPredictionTimeInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public ArrivalPredictionTimeInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ArrivalPredictionTimeInfo(GeneralizedTime tsmg_MessageGenerationTime, 
		    Tpfc_BusEventCodeNumber tpfc_BusEventCodeNumber, 
		    UTF8String16 tpif_BITIdentifyNumber, 
		    UTF8String16 tpif_SubRouteIdentityNumber, 
		    UTF8String16 tsfc_PTVehicleIDNumber, 
		    INTEGER tpif_AccesspointArrivalTime, 
		    INTEGER tpif_AccesspointArrivalCount, 
		    INTEGER tsvh_NodeRouteSequence, 
		    UTF8String16 tpif_LastBITIdentifyNumber, 
		    GeneralizedTime tsvh_LastBITZoneEntryTime, 
		    GeneralizedTime tsvh_LastBITZoneExitTime, 
		    INTEGER tsvh_LastBITZoneTripTime, 
		    INTEGER tsvh_RollingAverageSpeedRate, 
		    BOOLEAN tsfc_LastPTVehicle, 
		    UTF8String16 tpif_EndNodeZoneIDNumber, 
		    INTEGER tpif_EndNodeRouteSequence, 
		    INTEGER tsfc_BusTotalSeatsNumber, 
		    INTEGER tsfc_BusPassengerNumber, 
		    INTEGER tsfc_BusRemainSeatsNumber)
    {
	setTsmg_MessageGenerationTime(tsmg_MessageGenerationTime);
	setTpfc_BusEventCodeNumber(tpfc_BusEventCodeNumber);
	setTpif_BITIdentifyNumber(tpif_BITIdentifyNumber);
	setTpif_SubRouteIdentityNumber(tpif_SubRouteIdentityNumber);
	setTsfc_PTVehicleIDNumber(tsfc_PTVehicleIDNumber);
	setTpif_AccesspointArrivalTime(tpif_AccesspointArrivalTime);
	setTpif_AccesspointArrivalCount(tpif_AccesspointArrivalCount);
	setTsvh_NodeRouteSequence(tsvh_NodeRouteSequence);
	setTpif_LastBITIdentifyNumber(tpif_LastBITIdentifyNumber);
	setTsvh_LastBITZoneEntryTime(tsvh_LastBITZoneEntryTime);
	setTsvh_LastBITZoneExitTime(tsvh_LastBITZoneExitTime);
	setTsvh_LastBITZoneTripTime(tsvh_LastBITZoneTripTime);
	setTsvh_RollingAverageSpeedRate(tsvh_RollingAverageSpeedRate);
	setTsfc_LastPTVehicle(tsfc_LastPTVehicle);
	setTpif_EndNodeZoneIDNumber(tpif_EndNodeZoneIDNumber);
	setTpif_EndNodeRouteSequence(tpif_EndNodeRouteSequence);
	setTsfc_BusTotalSeatsNumber(tsfc_BusTotalSeatsNumber);
	setTsfc_BusPassengerNumber(tsfc_BusPassengerNumber);
	setTsfc_BusRemainSeatsNumber(tsfc_BusRemainSeatsNumber);
    }
    
    /**
     * Construct with components.
     */
    public ArrivalPredictionTimeInfo(GeneralizedTime tsmg_MessageGenerationTime, 
		    Tpfc_BusEventCodeNumber tpfc_BusEventCodeNumber, 
		    UTF8String16 tpif_BITIdentifyNumber, 
		    UTF8String16 tpif_SubRouteIdentityNumber, 
		    UTF8String16 tsfc_PTVehicleIDNumber, 
		    long tpif_AccesspointArrivalTime, 
		    long tpif_AccesspointArrivalCount, 
		    long tsvh_NodeRouteSequence, 
		    UTF8String16 tpif_LastBITIdentifyNumber, 
		    GeneralizedTime tsvh_LastBITZoneEntryTime, 
		    GeneralizedTime tsvh_LastBITZoneExitTime, 
		    long tsvh_LastBITZoneTripTime, 
		    long tsvh_RollingAverageSpeedRate, 
		    boolean tsfc_LastPTVehicle, 
		    UTF8String16 tpif_EndNodeZoneIDNumber, 
		    long tpif_EndNodeRouteSequence, 
		    long tsfc_BusTotalSeatsNumber, 
		    long tsfc_BusPassengerNumber, 
		    long tsfc_BusRemainSeatsNumber)
    {
	this(tsmg_MessageGenerationTime, tpfc_BusEventCodeNumber, 
	     tpif_BITIdentifyNumber, tpif_SubRouteIdentityNumber, 
	     tsfc_PTVehicleIDNumber, 
	     new INTEGER(tpif_AccesspointArrivalTime), 
	     new INTEGER(tpif_AccesspointArrivalCount), 
	     new INTEGER(tsvh_NodeRouteSequence), 
	     tpif_LastBITIdentifyNumber, tsvh_LastBITZoneEntryTime, 
	     tsvh_LastBITZoneExitTime, 
	     new INTEGER(tsvh_LastBITZoneTripTime), 
	     new INTEGER(tsvh_RollingAverageSpeedRate), 
	     new BOOLEAN(tsfc_LastPTVehicle), tpif_EndNodeZoneIDNumber, 
	     new INTEGER(tpif_EndNodeRouteSequence), 
	     new INTEGER(tsfc_BusTotalSeatsNumber), 
	     new INTEGER(tsfc_BusPassengerNumber), 
	     new INTEGER(tsfc_BusRemainSeatsNumber));
    }
    
    /**
     * Construct with required components.
     */
    public ArrivalPredictionTimeInfo(GeneralizedTime tsmg_MessageGenerationTime, 
		    Tpfc_BusEventCodeNumber tpfc_BusEventCodeNumber, 
		    UTF8String16 tpif_BITIdentifyNumber, 
		    UTF8String16 tpif_SubRouteIdentityNumber, 
		    UTF8String16 tsfc_PTVehicleIDNumber, 
		    long tpif_AccesspointArrivalTime, 
		    long tpif_AccesspointArrivalCount, 
		    long tsvh_NodeRouteSequence)
    {
	setTsmg_MessageGenerationTime(tsmg_MessageGenerationTime);
	setTpfc_BusEventCodeNumber(tpfc_BusEventCodeNumber);
	setTpif_BITIdentifyNumber(tpif_BITIdentifyNumber);
	setTpif_SubRouteIdentityNumber(tpif_SubRouteIdentityNumber);
	setTsfc_PTVehicleIDNumber(tsfc_PTVehicleIDNumber);
	setTpif_AccesspointArrivalTime(tpif_AccesspointArrivalTime);
	setTpif_AccesspointArrivalCount(tpif_AccesspointArrivalCount);
	setTsvh_NodeRouteSequence(tsvh_NodeRouteSequence);
    }
    
    public void initComponents()
    {
	mComponents[0] = new GeneralizedTime();
	mComponents[1] = Tpfc_BusEventCodeNumber.enter_BusStop;
	mComponents[2] = new UTF8String16();
	mComponents[3] = new UTF8String16();
	mComponents[4] = new UTF8String16();
	mComponents[5] = new INTEGER();
	mComponents[6] = new INTEGER();
	mComponents[7] = new INTEGER();
	mComponents[8] = new UTF8String16();
	mComponents[9] = new GeneralizedTime();
	mComponents[10] = new GeneralizedTime();
	mComponents[11] = new INTEGER();
	mComponents[12] = new INTEGER();
	mComponents[13] = new BOOLEAN();
	mComponents[14] = new UTF8String16();
	mComponents[15] = new INTEGER();
	mComponents[16] = new INTEGER();
	mComponents[17] = new INTEGER();
	mComponents[18] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[19];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new GeneralizedTime();
	    case 1:
		return Tpfc_BusEventCodeNumber.enter_BusStop;
	    case 2:
		return new UTF8String16();
	    case 3:
		return new UTF8String16();
	    case 4:
		return new UTF8String16();
	    case 5:
		return new INTEGER();
	    case 6:
		return new INTEGER();
	    case 7:
		return new INTEGER();
	    case 8:
		return new UTF8String16();
	    case 9:
		return new GeneralizedTime();
	    case 10:
		return new GeneralizedTime();
	    case 11:
		return new INTEGER();
	    case 12:
		return new INTEGER();
	    case 13:
		return new BOOLEAN();
	    case 14:
		return new UTF8String16();
	    case 15:
		return new INTEGER();
	    case 16:
		return new INTEGER();
	    case 17:
		return new INTEGER();
	    case 18:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tsmg_MessageGenerationTime"
    public GeneralizedTime getTsmg_MessageGenerationTime()
    {
	return (GeneralizedTime)mComponents[0];
    }
    
    public void setTsmg_MessageGenerationTime(GeneralizedTime tsmg_MessageGenerationTime)
    {
	mComponents[0] = tsmg_MessageGenerationTime;
    }
    
    
    // Methods for field "tpfc_BusEventCodeNumber"
    public Tpfc_BusEventCodeNumber getTpfc_BusEventCodeNumber()
    {
	return (Tpfc_BusEventCodeNumber)mComponents[1];
    }
    
    public void setTpfc_BusEventCodeNumber(Tpfc_BusEventCodeNumber tpfc_BusEventCodeNumber)
    {
	mComponents[1] = tpfc_BusEventCodeNumber;
    }
    
    
    
    /**
     * Define the ASN1 Type Tpfc_BusEventCodeNumber from ASN1 Module BusInfomation.
     * @see Enumerated
     */
    public static final class Tpfc_BusEventCodeNumber extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Tpfc_BusEventCodeNumber()
	{
	    super(cFirstNumber);
	}
	
	protected Tpfc_BusEventCodeNumber(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long enter_BusStop = 0;
	    public static final long exit_BusStop = 1;
	    public static final long pass_Cross = 2;
	    public static final long fixed_Cycle = 3;
	    public static final long enter_Cross = 4;
	    public static final long exit_Cross = 5;
	}
	// Named list definitions.
	private final static Tpfc_BusEventCodeNumber cNamedNumbers[] = {
	    new Tpfc_BusEventCodeNumber(), 
	    new Tpfc_BusEventCodeNumber(1), 
	    new Tpfc_BusEventCodeNumber(2), 
	    new Tpfc_BusEventCodeNumber(3), 
	    new Tpfc_BusEventCodeNumber(4), 
	    new Tpfc_BusEventCodeNumber(5)
	};
	public static final Tpfc_BusEventCodeNumber enter_BusStop = cNamedNumbers[0];
	public static final Tpfc_BusEventCodeNumber exit_BusStop = cNamedNumbers[1];
	public static final Tpfc_BusEventCodeNumber pass_Cross = cNamedNumbers[2];
	public static final Tpfc_BusEventCodeNumber fixed_Cycle = cNamedNumbers[3];
	public static final Tpfc_BusEventCodeNumber enter_Cross = cNamedNumbers[4];
	public static final Tpfc_BusEventCodeNumber exit_Cross = cNamedNumbers[5];
	
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	/**
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int indexOfValue(long value)
	{
	    if (value >= 0 && value <= 5)
		return (int)value;
	    else
		return -1;
	}
	
	/**
	 * Returns the enumerator with the specified value or null if the value
	 * is not associated with any enumerator.
	 *  @param value The value of the enumerator to return.
	 *  @return The enumerator with the specified value.
	 */
	
	public static Tpfc_BusEventCodeNumber valueOf(long value)
	{
	    int inx = indexOfValue(value);
	    
	    if (inx < 0)
		return null;
	    else
		return cNamedNumbers[inx];
	}
	
	/**
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public int indexOf()
	{
	    return indexOfValue(mValue);
	}
	
	/**
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public Enumerated lookupValue(long value)
	{
	    return valueOf(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"datex.businfomation",
		"ArrivalPredictionTimeInfo$Tpfc_BusEventCodeNumber"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    800787,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"enter-BusStop",
			0
		    ),
		    new MemberListElement (
			"exit-BusStop",
			1
		    ),
		    new MemberListElement (
			"pass-Cross",
			2
		    ),
		    new MemberListElement (
			"fixed-Cycle",
			3
		    ),
		    new MemberListElement (
			"enter-Cross",
			4
		    ),
		    new MemberListElement (
			"exit-Cross",
			5
		    )
		}
	    ),
	    0,
	    enter_BusStop
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tpfc_BusEventCodeNumber object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tpfc_BusEventCodeNumber object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tpfc_BusEventCodeNumber

    // Methods for field "tpif_BITIdentifyNumber"
    public UTF8String16 getTpif_BITIdentifyNumber()
    {
	return (UTF8String16)mComponents[2];
    }
    
    public void setTpif_BITIdentifyNumber(UTF8String16 tpif_BITIdentifyNumber)
    {
	mComponents[2] = tpif_BITIdentifyNumber;
    }
    
    
    // Methods for field "tpif_SubRouteIdentityNumber"
    public UTF8String16 getTpif_SubRouteIdentityNumber()
    {
	return (UTF8String16)mComponents[3];
    }
    
    public void setTpif_SubRouteIdentityNumber(UTF8String16 tpif_SubRouteIdentityNumber)
    {
	mComponents[3] = tpif_SubRouteIdentityNumber;
    }
    
    
    // Methods for field "tsfc_PTVehicleIDNumber"
    public UTF8String16 getTsfc_PTVehicleIDNumber()
    {
	return (UTF8String16)mComponents[4];
    }
    
    public void setTsfc_PTVehicleIDNumber(UTF8String16 tsfc_PTVehicleIDNumber)
    {
	mComponents[4] = tsfc_PTVehicleIDNumber;
    }
    
    
    // Methods for field "tpif_AccesspointArrivalTime"
    public long getTpif_AccesspointArrivalTime()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setTpif_AccesspointArrivalTime(long tpif_AccesspointArrivalTime)
    {
	setTpif_AccesspointArrivalTime(new INTEGER(tpif_AccesspointArrivalTime));
    }
    
    public void setTpif_AccesspointArrivalTime(INTEGER tpif_AccesspointArrivalTime)
    {
	mComponents[5] = tpif_AccesspointArrivalTime;
    }
    
    
    // Methods for field "tpif_AccesspointArrivalCount"
    public long getTpif_AccesspointArrivalCount()
    {
	return ((INTEGER)mComponents[6]).longValue();
    }
    
    public void setTpif_AccesspointArrivalCount(long tpif_AccesspointArrivalCount)
    {
	setTpif_AccesspointArrivalCount(new INTEGER(tpif_AccesspointArrivalCount));
    }
    
    public void setTpif_AccesspointArrivalCount(INTEGER tpif_AccesspointArrivalCount)
    {
	mComponents[6] = tpif_AccesspointArrivalCount;
    }
    
    
    // Methods for field "tsvh_NodeRouteSequence"
    public long getTsvh_NodeRouteSequence()
    {
	return ((INTEGER)mComponents[7]).longValue();
    }
    
    public void setTsvh_NodeRouteSequence(long tsvh_NodeRouteSequence)
    {
	setTsvh_NodeRouteSequence(new INTEGER(tsvh_NodeRouteSequence));
    }
    
    public void setTsvh_NodeRouteSequence(INTEGER tsvh_NodeRouteSequence)
    {
	mComponents[7] = tsvh_NodeRouteSequence;
    }
    
    
    // Methods for field "tpif_LastBITIdentifyNumber"
    public UTF8String16 getTpif_LastBITIdentifyNumber()
    {
	return (UTF8String16)mComponents[8];
    }
    
    public void setTpif_LastBITIdentifyNumber(UTF8String16 tpif_LastBITIdentifyNumber)
    {
	mComponents[8] = tpif_LastBITIdentifyNumber;
    }
    
    public boolean hasTpif_LastBITIdentifyNumber()
    {
	return componentIsPresent(8);
    }
    
    public void deleteTpif_LastBITIdentifyNumber()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "tsvh_LastBITZoneEntryTime"
    public GeneralizedTime getTsvh_LastBITZoneEntryTime()
    {
	return (GeneralizedTime)mComponents[9];
    }
    
    public void setTsvh_LastBITZoneEntryTime(GeneralizedTime tsvh_LastBITZoneEntryTime)
    {
	mComponents[9] = tsvh_LastBITZoneEntryTime;
    }
    
    public boolean hasTsvh_LastBITZoneEntryTime()
    {
	return componentIsPresent(9);
    }
    
    public void deleteTsvh_LastBITZoneEntryTime()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "tsvh_LastBITZoneExitTime"
    public GeneralizedTime getTsvh_LastBITZoneExitTime()
    {
	return (GeneralizedTime)mComponents[10];
    }
    
    public void setTsvh_LastBITZoneExitTime(GeneralizedTime tsvh_LastBITZoneExitTime)
    {
	mComponents[10] = tsvh_LastBITZoneExitTime;
    }
    
    public boolean hasTsvh_LastBITZoneExitTime()
    {
	return componentIsPresent(10);
    }
    
    public void deleteTsvh_LastBITZoneExitTime()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "tsvh_LastBITZoneTripTime"
    public long getTsvh_LastBITZoneTripTime()
    {
	return ((INTEGER)mComponents[11]).longValue();
    }
    
    public void setTsvh_LastBITZoneTripTime(long tsvh_LastBITZoneTripTime)
    {
	setTsvh_LastBITZoneTripTime(new INTEGER(tsvh_LastBITZoneTripTime));
    }
    
    public void setTsvh_LastBITZoneTripTime(INTEGER tsvh_LastBITZoneTripTime)
    {
	mComponents[11] = tsvh_LastBITZoneTripTime;
    }
    
    public boolean hasTsvh_LastBITZoneTripTime()
    {
	return componentIsPresent(11);
    }
    
    public void deleteTsvh_LastBITZoneTripTime()
    {
	setComponentAbsent(11);
    }
    
    
    // Methods for field "tsvh_RollingAverageSpeedRate"
    public long getTsvh_RollingAverageSpeedRate()
    {
	return ((INTEGER)mComponents[12]).longValue();
    }
    
    public void setTsvh_RollingAverageSpeedRate(long tsvh_RollingAverageSpeedRate)
    {
	setTsvh_RollingAverageSpeedRate(new INTEGER(tsvh_RollingAverageSpeedRate));
    }
    
    public void setTsvh_RollingAverageSpeedRate(INTEGER tsvh_RollingAverageSpeedRate)
    {
	mComponents[12] = tsvh_RollingAverageSpeedRate;
    }
    
    public boolean hasTsvh_RollingAverageSpeedRate()
    {
	return componentIsPresent(12);
    }
    
    public void deleteTsvh_RollingAverageSpeedRate()
    {
	setComponentAbsent(12);
    }
    
    
    // Methods for field "tsfc_LastPTVehicle"
    public boolean getTsfc_LastPTVehicle()
    {
	return ((BOOLEAN)mComponents[13]).booleanValue();
    }
    
    public void setTsfc_LastPTVehicle(boolean tsfc_LastPTVehicle)
    {
	setTsfc_LastPTVehicle(new BOOLEAN(tsfc_LastPTVehicle));
    }
    
    public void setTsfc_LastPTVehicle(BOOLEAN tsfc_LastPTVehicle)
    {
	mComponents[13] = tsfc_LastPTVehicle;
    }
    
    public boolean hasTsfc_LastPTVehicle()
    {
	return componentIsPresent(13);
    }
    
    public void deleteTsfc_LastPTVehicle()
    {
	setComponentAbsent(13);
    }
    
    
    // Methods for field "tpif_EndNodeZoneIDNumber"
    public UTF8String16 getTpif_EndNodeZoneIDNumber()
    {
	return (UTF8String16)mComponents[14];
    }
    
    public void setTpif_EndNodeZoneIDNumber(UTF8String16 tpif_EndNodeZoneIDNumber)
    {
	mComponents[14] = tpif_EndNodeZoneIDNumber;
    }
    
    public boolean hasTpif_EndNodeZoneIDNumber()
    {
	return componentIsPresent(14);
    }
    
    public void deleteTpif_EndNodeZoneIDNumber()
    {
	setComponentAbsent(14);
    }
    
    
    // Methods for field "tpif_EndNodeRouteSequence"
    public long getTpif_EndNodeRouteSequence()
    {
	return ((INTEGER)mComponents[15]).longValue();
    }
    
    public void setTpif_EndNodeRouteSequence(long tpif_EndNodeRouteSequence)
    {
	setTpif_EndNodeRouteSequence(new INTEGER(tpif_EndNodeRouteSequence));
    }
    
    public void setTpif_EndNodeRouteSequence(INTEGER tpif_EndNodeRouteSequence)
    {
	mComponents[15] = tpif_EndNodeRouteSequence;
    }
    
    public boolean hasTpif_EndNodeRouteSequence()
    {
	return componentIsPresent(15);
    }
    
    public void deleteTpif_EndNodeRouteSequence()
    {
	setComponentAbsent(15);
    }
    
    
    // Methods for field "tsfc_BusTotalSeatsNumber"
    public long getTsfc_BusTotalSeatsNumber()
    {
	return ((INTEGER)mComponents[16]).longValue();
    }
    
    public void setTsfc_BusTotalSeatsNumber(long tsfc_BusTotalSeatsNumber)
    {
	setTsfc_BusTotalSeatsNumber(new INTEGER(tsfc_BusTotalSeatsNumber));
    }
    
    public void setTsfc_BusTotalSeatsNumber(INTEGER tsfc_BusTotalSeatsNumber)
    {
	mComponents[16] = tsfc_BusTotalSeatsNumber;
    }
    
    public boolean hasTsfc_BusTotalSeatsNumber()
    {
	return componentIsPresent(16);
    }
    
    public void deleteTsfc_BusTotalSeatsNumber()
    {
	setComponentAbsent(16);
    }
    
    
    // Methods for field "tsfc_BusPassengerNumber"
    public long getTsfc_BusPassengerNumber()
    {
	return ((INTEGER)mComponents[17]).longValue();
    }
    
    public void setTsfc_BusPassengerNumber(long tsfc_BusPassengerNumber)
    {
	setTsfc_BusPassengerNumber(new INTEGER(tsfc_BusPassengerNumber));
    }
    
    public void setTsfc_BusPassengerNumber(INTEGER tsfc_BusPassengerNumber)
    {
	mComponents[17] = tsfc_BusPassengerNumber;
    }
    
    public boolean hasTsfc_BusPassengerNumber()
    {
	return componentIsPresent(17);
    }
    
    public void deleteTsfc_BusPassengerNumber()
    {
	setComponentAbsent(17);
    }
    
    
    // Methods for field "tsfc_BusRemainSeatsNumber"
    public long getTsfc_BusRemainSeatsNumber()
    {
	return ((INTEGER)mComponents[18]).longValue();
    }
    
    public void setTsfc_BusRemainSeatsNumber(long tsfc_BusRemainSeatsNumber)
    {
	setTsfc_BusRemainSeatsNumber(new INTEGER(tsfc_BusRemainSeatsNumber));
    }
    
    public void setTsfc_BusRemainSeatsNumber(INTEGER tsfc_BusRemainSeatsNumber)
    {
	mComponents[18] = tsfc_BusRemainSeatsNumber;
    }
    
    public boolean hasTsfc_BusRemainSeatsNumber()
    {
	return componentIsPresent(18);
    }
    
    public void deleteTsfc_BusRemainSeatsNumber()
    {
	setComponentAbsent(18);
    }
    
    
    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "datex.businfomation",
	    "ArrivalPredictionTimeInfo"
	),
	new QName (
	    "BusInfomation",
	    "ArrivalPredictionTimeInfo"
	),
	800787,
	null,
	new FieldsList (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"GeneralizedTime"
			    ),
			    new QName (
				"builtin",
				"GeneralizedTime"
			    ),
			    800787,
			    null
			)
		    ),
		    "tsmg-MessageGenerationTime",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "ArrivalPredictionTimeInfo$Tpfc_BusEventCodeNumber"
			)
		    ),
		    "tpfc-BusEventCodeNumber",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"UTF8String16"
			    ),
			    new QName (
				"builtin",
				"UTF8String16"
			    ),
			    800787,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(40),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "tpif-BITIdentifyNumber",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"UTF8String16"
			    ),
			    new QName (
				"builtin",
				"UTF8String16"
			    ),
			    800787,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(255),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "tpif-SubRouteIdentityNumber",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"UTF8String16"
			    ),
			    new QName (
				"builtin",
				"UTF8String16"
			    ),
			    800787,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(255),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "tsfc-PTVehicleIDNumber",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    800787,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(72000),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "tpif-AccesspointArrivalTime",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    800787,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(512),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "tpif-AccesspointArrivalCount",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    800787,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(512),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "tsvh-NodeRouteSequence",
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"UTF8String16"
			    ),
			    new QName (
				"builtin",
				"UTF8String16"
			    ),
			    800787,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(255),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "tpif-LastBITIdentifyNumber",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"GeneralizedTime"
			    ),
			    new QName (
				"builtin",
				"GeneralizedTime"
			    ),
			    800787,
			    null
			)
		    ),
		    "tsvh-LastBITZoneEntryTime",
		    9,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"GeneralizedTime"
			    ),
			    new QName (
				"builtin",
				"GeneralizedTime"
			    ),
			    800787,
			    null
			)
		    ),
		    "tsvh-LastBITZoneExitTime",
		    10,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    800787,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(1200),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "tsvh-LastBITZoneTripTime",
		    11,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    800787,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(300),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "tsvh-RollingAverageSpeedRate",
		    12,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    800787,
			    null
			)
		    ),
		    "tsfc-LastPTVehicle",
		    13,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"UTF8String16"
			    ),
			    new QName (
				"builtin",
				"UTF8String16"
			    ),
			    800787,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(40),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "tpif-EndNodeZoneIDNumber",
		    14,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    800787,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(512),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "tpif-EndNodeRouteSequence",
		    15,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8010
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    800787,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(512),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "tsfc-BusTotalSeatsNumber",
		    16,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8011
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    800787,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(512),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "tsfc-BusPassengerNumber",
		    17,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8012
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    800787,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(512),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "tsfc-BusRemainSeatsNumber",
		    18,
		    3,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8012, 18)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ArrivalPredictionTimeInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ArrivalPredictionTimeInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ArrivalPredictionTimeInfo
