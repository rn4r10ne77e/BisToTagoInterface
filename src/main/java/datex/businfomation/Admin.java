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

import com.oss.asn1.AbstractData;
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.asn1.UTF8String16;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type Admin from ASN1 Module BusInfomation.
 * @see Sequence
 */

public class Admin extends Sequence {
    
    /**
     * The default constructor.
     */
    public Admin()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Admin(UTF8String16 trnt_Admin_id, UTF8String16 admin_Moi_id, 
		    UTF8String16 admin_Admin_nm1, 
		    UTF8String16 admin_Admin_nm2, UTF8String16 admin_Reg_date, 
		    UTF8String16 admin_Remark)
    {
	setTrnt_Admin_id(trnt_Admin_id);
	setAdmin_Moi_id(admin_Moi_id);
	setAdmin_Admin_nm1(admin_Admin_nm1);
	setAdmin_Admin_nm2(admin_Admin_nm2);
	setAdmin_Reg_date(admin_Reg_date);
	setAdmin_Remark(admin_Remark);
    }
    
    /**
     * Construct with required components.
     */
    public Admin(UTF8String16 trnt_Admin_id, UTF8String16 admin_Moi_id, 
		    UTF8String16 admin_Admin_nm1, 
		    UTF8String16 admin_Admin_nm2, UTF8String16 admin_Reg_date)
    {
	setTrnt_Admin_id(trnt_Admin_id);
	setAdmin_Moi_id(admin_Moi_id);
	setAdmin_Admin_nm1(admin_Admin_nm1);
	setAdmin_Admin_nm2(admin_Admin_nm2);
	setAdmin_Reg_date(admin_Reg_date);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTF8String16();
	mComponents[1] = new UTF8String16();
	mComponents[2] = new UTF8String16();
	mComponents[3] = new UTF8String16();
	mComponents[4] = new UTF8String16();
	mComponents[5] = new UTF8String16();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new UTF8String16();
	    case 1:
		return new UTF8String16();
	    case 2:
		return new UTF8String16();
	    case 3:
		return new UTF8String16();
	    case 4:
		return new UTF8String16();
	    case 5:
		return new UTF8String16();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "trnt_Admin_id"
    public UTF8String16 getTrnt_Admin_id()
    {
	return (UTF8String16)mComponents[0];
    }
    
    public void setTrnt_Admin_id(UTF8String16 trnt_Admin_id)
    {
	mComponents[0] = trnt_Admin_id;
    }
    
    
    // Methods for field "admin_Moi_id"
    public UTF8String16 getAdmin_Moi_id()
    {
	return (UTF8String16)mComponents[1];
    }
    
    public void setAdmin_Moi_id(UTF8String16 admin_Moi_id)
    {
	mComponents[1] = admin_Moi_id;
    }
    
    
    // Methods for field "admin_Admin_nm1"
    public UTF8String16 getAdmin_Admin_nm1()
    {
	return (UTF8String16)mComponents[2];
    }
    
    public void setAdmin_Admin_nm1(UTF8String16 admin_Admin_nm1)
    {
	mComponents[2] = admin_Admin_nm1;
    }
    
    
    // Methods for field "admin_Admin_nm2"
    public UTF8String16 getAdmin_Admin_nm2()
    {
	return (UTF8String16)mComponents[3];
    }
    
    public void setAdmin_Admin_nm2(UTF8String16 admin_Admin_nm2)
    {
	mComponents[3] = admin_Admin_nm2;
    }
    
    
    // Methods for field "admin_Reg_date"
    public UTF8String16 getAdmin_Reg_date()
    {
	return (UTF8String16)mComponents[4];
    }
    
    public void setAdmin_Reg_date(UTF8String16 admin_Reg_date)
    {
	mComponents[4] = admin_Reg_date;
    }
    
    
    // Methods for field "admin_Remark"
    public UTF8String16 getAdmin_Remark()
    {
	return (UTF8String16)mComponents[5];
    }
    
    public void setAdmin_Remark(UTF8String16 admin_Remark)
    {
	mComponents[5] = admin_Remark;
    }
    
    public boolean hasAdmin_Remark()
    {
	return componentIsPresent(5);
    }
    
    public void deleteAdmin_Remark()
    {
	setComponentAbsent(5);
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
	    "Admin"
	),
	new QName (
	    "BusInfomation",
	    "Admin"
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
					new INTEGER(3),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "trnt-Admin-id",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
					new INTEGER(5),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "admin-Moi-id",
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
					new INTEGER(50),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "admin-Admin-nm1",
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
					new INTEGER(50),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "admin-Admin-nm2",
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
			    new Intersection (
				new SizeConstraint (
				    new SingleValueConstraint (
					new INTEGER(8)
				    )
				),
				new PermittedAlphabetConstraint (
				    new PermittedAlphabet (
					"0123456789"
				    )
				)
			    ),
			    null
			)
		    ),
		    "admin-Reg-date",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
		    "admin-Remark",
		    5,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Admin object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Admin object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Admin
