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


package datex.iso14827_1;

import com.oss.asn1.*;

public abstract class ISO14827_1 extends ASN1Module {

    
    
    // Information object sets
    public static ISO14827_MESSAGE_OSET message = 
	new ISO14827_MESSAGE_OSET (
	    new ISO14827_MESSAGE[] {
		new ISO14827_MESSAGE (
		    new PrintableString (
			"Request BusLocationInfo List"
		    ),
		    new PrintableString (
			""
		    ),
		    new ASN1Type (
			"com.oss.asn1",
			"Null"
		    ),
		    null,
		    ISO14827_MESSAGE.MessageType.subscription,
		    ISO14827_MESSAGE.SubscriptionType.event_or_periodic,
		    null,
		    null,
		    new ObjectIdentifier (
			new byte[] { 
			    (byte)0x28, (byte)0xF3, (byte)0x6B, (byte)0x81, 
			    (byte)0x49, (byte)0x01
			}
		    ),
		    new INTEGER(1)
		),
		new ISO14827_MESSAGE (
		    new PrintableString (
			"Response BusLocationInfo List"
		    ),
		    new PrintableString (
			""
		    ),
		    new ASN1Type (
			"datex.iso14827_1",
			"Message_MESSAGE_BODY_1"
		    ),
		    null,
		    ISO14827_MESSAGE.MessageType.publication,
		    null,
		    null,
		    null,
		    new ObjectIdentifier (
			new byte[] { 
			    (byte)0x28, (byte)0xF3, (byte)0x6B, (byte)0x81, 
			    (byte)0x49, (byte)0x02
			}
		    ),
		    new INTEGER(2)
		),
		new ISO14827_MESSAGE (
		    new PrintableString (
			"Request ArrivalPredictionTimeInfo List"
		    ),
		    new PrintableString (
			""
		    ),
		    new ASN1Type (
			"com.oss.asn1",
			"Null"
		    ),
		    null,
		    ISO14827_MESSAGE.MessageType.subscription,
		    ISO14827_MESSAGE.SubscriptionType.periodic,
		    null,
		    null,
		    new ObjectIdentifier (
			new byte[] { 
			    (byte)0x28, (byte)0xF3, (byte)0x6B, (byte)0x81, 
			    (byte)0x4A, (byte)0x01
			}
		    ),
		    new INTEGER(3)
		),
		new ISO14827_MESSAGE (
		    new PrintableString (
			"Response ArrivalPredictionTimeInfo List"
		    ),
		    new PrintableString (
			""
		    ),
		    new ASN1Type (
			"datex.iso14827_1",
			"Message_MESSAGE_BODY_2"
		    ),
		    null,
		    ISO14827_MESSAGE.MessageType.publication,
		    null,
		    null,
		    null,
		    new ObjectIdentifier (
			new byte[] { 
			    (byte)0x28, (byte)0xF3, (byte)0x6B, (byte)0x81, 
			    (byte)0x4A, (byte)0x02
			}
		    ),
		    new INTEGER(4)
		),
		new ISO14827_MESSAGE (
		    new PrintableString (
			"Request BusBaseInformationVersion"
		    ),
		    new PrintableString (
			""
		    ),
		    new ASN1Type (
			"com.oss.asn1",
			"Null"
		    ),
		    null,
		    ISO14827_MESSAGE.MessageType.subscription,
		    ISO14827_MESSAGE.SubscriptionType.event_or_periodic,
		    null,
		    null,
		    new ObjectIdentifier (
			new byte[] { 
			    (byte)0x28, (byte)0xF3, (byte)0x6B, (byte)0x81, 
			    (byte)0x4F, (byte)0x01
			}
		    ),
		    new INTEGER(5)
		),
		new ISO14827_MESSAGE (
		    new PrintableString (
			"Response BusBaseInformationVersion"
		    ),
		    new PrintableString (
			""
		    ),
		    new ASN1Type (
    		"datex.iso14827_1",
			"Message_MESSAGE_BODY_3"
		    ),
		    null,
		    ISO14827_MESSAGE.MessageType.publication,
		    null,
		    null,
		    null,
		    new ObjectIdentifier (
			new byte[] { 
			    (byte)0x28, (byte)0xF3, (byte)0x6B, (byte)0x81, 
			    (byte)0x4F, (byte)0x02
			}
		    ),
		    new INTEGER(6)
		),
		new ISO14827_MESSAGE (
		    new PrintableString (
			"Request BusBaseInformation"
		    ),
		    new PrintableString (
			""
		    ),
		    new ASN1Type (
			"com.oss.asn1",
			"Null"
		    ),
		    null,
		    ISO14827_MESSAGE.MessageType.subscription,
		    ISO14827_MESSAGE.SubscriptionType.single,
		    null,
		    null,
		    new ObjectIdentifier (
			new byte[] { 
			    (byte)0x28, (byte)0xF3, (byte)0x6B, (byte)0x81, 
			    (byte)0x50, (byte)0x01
			}
		    ),
		    new INTEGER(7)
		),
		new ISO14827_MESSAGE (
		    new PrintableString (
			"Response BusBaseInformation"
		    ),
		    new PrintableString (
			""
		    ),
		    new ASN1Type (
    		"datex.iso14827_1",
			"Message_MESSAGE_BODY_4"
		    ),
		    null,
		    ISO14827_MESSAGE.MessageType.publication,
		    null,
		    null,
		    null,
		    new ObjectIdentifier (
			new byte[] { 
			    (byte)0x28, (byte)0xF3, (byte)0x6B, (byte)0x81, 
			    (byte)0x50, (byte)0x02
			}
		    ),
		    new INTEGER(8)
		)
	    },
	    0,
	    "ISO14827-1",
	    "Message"
	);
    
}
