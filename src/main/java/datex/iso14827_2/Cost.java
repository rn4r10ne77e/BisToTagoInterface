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
import com.oss.asn1.INTEGER;
import com.oss.asn1.OctetString;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type Cost from ASN1 Module ISO14827_2.
 * @see Sequence
 */

public class Cost extends Sequence {
    
    /**
     * The default constructor.
     */
    public Cost()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Cost(OctetString amount_Currency_code, 
		    INTEGER amount_Factor_quantity, 
		    INTEGER amount_Quantity_quantity)
    {
	setAmount_Currency_code(amount_Currency_code);
	setAmount_Factor_quantity(amount_Factor_quantity);
	setAmount_Quantity_quantity(amount_Quantity_quantity);
    }
    
    /**
     * Construct with components.
     */
    public Cost(OctetString amount_Currency_code, long amount_Factor_quantity, 
		    long amount_Quantity_quantity)
    {
	this(amount_Currency_code, new INTEGER(amount_Factor_quantity), 
	     new INTEGER(amount_Quantity_quantity));
    }
    
    public void initComponents()
    {
	mComponents[0] = new OctetString();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new OctetString();
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "amount_Currency_code"
    public OctetString getAmount_Currency_code()
    {
	return (OctetString)mComponents[0];
    }
    
    public void setAmount_Currency_code(OctetString amount_Currency_code)
    {
	mComponents[0] = amount_Currency_code;
    }
    
    
    // Methods for field "amount_Factor_quantity"
    public long getAmount_Factor_quantity()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setAmount_Factor_quantity(long amount_Factor_quantity)
    {
	setAmount_Factor_quantity(new INTEGER(amount_Factor_quantity));
    }
    
    public void setAmount_Factor_quantity(INTEGER amount_Factor_quantity)
    {
	mComponents[1] = amount_Factor_quantity;
    }
    
    
    // Methods for field "amount_Quantity_quantity"
    public long getAmount_Quantity_quantity()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setAmount_Quantity_quantity(long amount_Quantity_quantity)
    {
	setAmount_Quantity_quantity(new INTEGER(amount_Quantity_quantity));
    }
    
    public void setAmount_Quantity_quantity(INTEGER amount_Quantity_quantity)
    {
	mComponents[2] = amount_Quantity_quantity;
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
	    "datex.iso14827_2",
	    "Cost"
	),
	new QName (
	    "ISO14827-2",
	    "Cost"
	),
	800787,
	null,
	new FieldsList (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"OctetString"
			    ),
			    new QName (
				"builtin",
				"OCTET STRING"
			    ),
			    800787,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new INTEGER(3)
				)
			    ),
			    null
			)
		    ),
		    "amount-Currency-code",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
			    null,
			    null,
			    null
			)
		    ),
		    "amount-Factor-quantity",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
			    null,
			    null,
			    null
			)
		    ),
		    "amount-Quantity-quantity",
		    2,
		    2,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Cost object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Cost object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Cost
