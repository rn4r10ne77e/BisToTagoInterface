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


package datex.iso14827_2;

import com.oss.asn1.AbstractData;
import com.oss.asn1.Choice;
import com.oss.asn1.Null;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type SubscriptionMode from ASN1 Module ISO14827_2.
 * @see Choice
 */

public class SubscriptionMode extends Choice {
    
    /**
     * The default constructor.
     */
    public SubscriptionMode()
    {
    }
    
    public static final  int  single_chosen = 1;
    public static final  int  event_driven_chosen = 2;
    public static final  int  periodic_chosen = 3;
    
    // Methods for field "single"
    public static SubscriptionMode createSubscriptionModeWithSingle(Null single)
    {
	SubscriptionMode __object = new SubscriptionMode();

	__object.setSingle(single);
	return __object;
    }
    
    public boolean hasSingle()
    {
	return getChosenFlag() == single_chosen;
    }
    
    public Null getSingle()
    {
	if (hasSingle())
	    return (Null)mChosenValue;
	else
	    return null;
    }
    
    public void setSingle(Null single)
    {
	setChosenValue(single);
	setChosenFlag(single_chosen);
    }
    
    
    // Methods for field "event_driven"
    public static SubscriptionMode createSubscriptionModeWithEvent_driven(Registered event_driven)
    {
	SubscriptionMode __object = new SubscriptionMode();

	__object.setEvent_driven(event_driven);
	return __object;
    }
    
    public boolean hasEvent_driven()
    {
	return getChosenFlag() == event_driven_chosen;
    }
    
    public Registered getEvent_driven()
    {
	if (hasEvent_driven())
	    return (Registered)mChosenValue;
	else
	    return null;
    }
    
    public void setEvent_driven(Registered event_driven)
    {
	setChosenValue(event_driven);
	setChosenFlag(event_driven_chosen);
    }
    
    
    // Methods for field "periodic"
    public static SubscriptionMode createSubscriptionModeWithPeriodic(Registered periodic)
    {
	SubscriptionMode __object = new SubscriptionMode();

	__object.setPeriodic(periodic);
	return __object;
    }
    
    public boolean hasPeriodic()
    {
	return getChosenFlag() == periodic_chosen;
    }
    
    public Registered getPeriodic()
    {
	if (hasPeriodic())
	    return (Registered)mChosenValue;
	else
	    return null;
    }
    
    public void setPeriodic(Registered periodic)
    {
	setChosenValue(periodic);
	setChosenFlag(periodic_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case single_chosen:
		return new Null();
	    case event_driven_chosen:
		return new Registered();
	    case periodic_chosen:
		return new Registered();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "datex.iso14827_2",
	    "SubscriptionMode"
	),
	new QName (
	    "ISO14827-2",
	    "SubscriptionMode"
	),
	800787,
	null,
	new FieldsList (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"Null"
			    ),
			    new QName (
				"builtin",
				"NULL"
			    ),
			    1849363,
			    null
			)
		    ),
		    "single",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"datex.iso14827_2",
				"Registered"
			    ),
			    new QName (
				"ISO14827-2",
				"Registered"
			    ),
			    800787,
			    null,
			    new FieldsRef (
				new QName (
				    "datex.iso14827_2",
				    "Registered"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "event-driven",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"datex.iso14827_2",
				"Registered"
			    ),
			    new QName (
				"ISO14827-2",
				"Registered"
			    ),
			    800787,
			    null,
			    new FieldsRef (
				new QName (
				    "datex.iso14827_2",
				    "Registered"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "periodic",
		    2,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SubscriptionMode object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SubscriptionMode object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SubscriptionMode
