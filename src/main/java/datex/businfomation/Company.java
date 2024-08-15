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
 * Define the ASN1 Type Company from ASN1 Module BusInfomation.
 * @see Sequence
 */

public class Company extends Sequence {
    
    /**
     * The default constructor.
     */
    public Company()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Company(UTF8String16 trnt_Company_id, 
		    UTF8String16 company_Company_nm, 
		    UTF8String16 company_Phone_no, 
		    UTF8String16 company_Fax_no, UTF8String16 company_Address, 
		    UTF8String16 company_Ceo_nm, INTEGER company_Bus_cnt, 
		    INTEGER company_Reg_cnt, INTEGER company_Spare_cnt, 
		    UTF8String16 company_Admin_id, 
		    UTF8String16 company_Reg_date, 
		    UTF8String16 company_Remark)
    {
	setTrnt_Company_id(trnt_Company_id);
	setCompany_Company_nm(company_Company_nm);
	setCompany_Phone_no(company_Phone_no);
	setCompany_Fax_no(company_Fax_no);
	setCompany_Address(company_Address);
	setCompany_Ceo_nm(company_Ceo_nm);
	setCompany_Bus_cnt(company_Bus_cnt);
	setCompany_Reg_cnt(company_Reg_cnt);
	setCompany_Spare_cnt(company_Spare_cnt);
	setCompany_Admin_id(company_Admin_id);
	setCompany_Reg_date(company_Reg_date);
	setCompany_Remark(company_Remark);
    }
    
    /**
     * Construct with components.
     */
    public Company(UTF8String16 trnt_Company_id, 
		    UTF8String16 company_Company_nm, 
		    UTF8String16 company_Phone_no, 
		    UTF8String16 company_Fax_no, UTF8String16 company_Address, 
		    UTF8String16 company_Ceo_nm, long company_Bus_cnt, 
		    long company_Reg_cnt, long company_Spare_cnt, 
		    UTF8String16 company_Admin_id, 
		    UTF8String16 company_Reg_date, 
		    UTF8String16 company_Remark)
    {
	this(trnt_Company_id, company_Company_nm, company_Phone_no, 
	     company_Fax_no, company_Address, company_Ceo_nm, 
	     new INTEGER(company_Bus_cnt), new INTEGER(company_Reg_cnt), 
	     new INTEGER(company_Spare_cnt), company_Admin_id, 
	     company_Reg_date, company_Remark);
    }
    
    /**
     * Construct with required components.
     */
    public Company(UTF8String16 trnt_Company_id, 
		    UTF8String16 company_Company_nm, 
		    UTF8String16 company_Phone_no, 
		    UTF8String16 company_Address, UTF8String16 company_Ceo_nm, 
		    long company_Bus_cnt, long company_Reg_cnt, 
		    long company_Spare_cnt, UTF8String16 company_Admin_id, 
		    UTF8String16 company_Reg_date)
    {
	setTrnt_Company_id(trnt_Company_id);
	setCompany_Company_nm(company_Company_nm);
	setCompany_Phone_no(company_Phone_no);
	setCompany_Address(company_Address);
	setCompany_Ceo_nm(company_Ceo_nm);
	setCompany_Bus_cnt(company_Bus_cnt);
	setCompany_Reg_cnt(company_Reg_cnt);
	setCompany_Spare_cnt(company_Spare_cnt);
	setCompany_Admin_id(company_Admin_id);
	setCompany_Reg_date(company_Reg_date);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTF8String16();
	mComponents[1] = new UTF8String16();
	mComponents[2] = new UTF8String16();
	mComponents[3] = new UTF8String16();
	mComponents[4] = new UTF8String16();
	mComponents[5] = new UTF8String16();
	mComponents[6] = new INTEGER();
	mComponents[7] = new INTEGER();
	mComponents[8] = new INTEGER();
	mComponents[9] = new UTF8String16();
	mComponents[10] = new UTF8String16();
	mComponents[11] = new UTF8String16();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[12];
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
	    case 6:
		return new INTEGER();
	    case 7:
		return new INTEGER();
	    case 8:
		return new INTEGER();
	    case 9:
		return new UTF8String16();
	    case 10:
		return new UTF8String16();
	    case 11:
		return new UTF8String16();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "trnt_Company_id"
    public UTF8String16 getTrnt_Company_id()
    {
	return (UTF8String16)mComponents[0];
    }
    
    public void setTrnt_Company_id(UTF8String16 trnt_Company_id)
    {
	mComponents[0] = trnt_Company_id;
    }
    
    
    // Methods for field "company_Company_nm"
    public UTF8String16 getCompany_Company_nm()
    {
	return (UTF8String16)mComponents[1];
    }
    
    public void setCompany_Company_nm(UTF8String16 company_Company_nm)
    {
	mComponents[1] = company_Company_nm;
    }
    
    
    // Methods for field "company_Phone_no"
    public UTF8String16 getCompany_Phone_no()
    {
	return (UTF8String16)mComponents[2];
    }
    
    public void setCompany_Phone_no(UTF8String16 company_Phone_no)
    {
	mComponents[2] = company_Phone_no;
    }
    
    
    // Methods for field "company_Fax_no"
    public UTF8String16 getCompany_Fax_no()
    {
	return (UTF8String16)mComponents[3];
    }
    
    public void setCompany_Fax_no(UTF8String16 company_Fax_no)
    {
	mComponents[3] = company_Fax_no;
    }
    
    public boolean hasCompany_Fax_no()
    {
	return componentIsPresent(3);
    }
    
    public void deleteCompany_Fax_no()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "company_Address"
    public UTF8String16 getCompany_Address()
    {
	return (UTF8String16)mComponents[4];
    }
    
    public void setCompany_Address(UTF8String16 company_Address)
    {
	mComponents[4] = company_Address;
    }
    
    
    // Methods for field "company_Ceo_nm"
    public UTF8String16 getCompany_Ceo_nm()
    {
	return (UTF8String16)mComponents[5];
    }
    
    public void setCompany_Ceo_nm(UTF8String16 company_Ceo_nm)
    {
	mComponents[5] = company_Ceo_nm;
    }
    
    
    // Methods for field "company_Bus_cnt"
    public long getCompany_Bus_cnt()
    {
	return ((INTEGER)mComponents[6]).longValue();
    }
    
    public void setCompany_Bus_cnt(long company_Bus_cnt)
    {
	setCompany_Bus_cnt(new INTEGER(company_Bus_cnt));
    }
    
    public void setCompany_Bus_cnt(INTEGER company_Bus_cnt)
    {
	mComponents[6] = company_Bus_cnt;
    }
    
    
    // Methods for field "company_Reg_cnt"
    public long getCompany_Reg_cnt()
    {
	return ((INTEGER)mComponents[7]).longValue();
    }
    
    public void setCompany_Reg_cnt(long company_Reg_cnt)
    {
	setCompany_Reg_cnt(new INTEGER(company_Reg_cnt));
    }
    
    public void setCompany_Reg_cnt(INTEGER company_Reg_cnt)
    {
	mComponents[7] = company_Reg_cnt;
    }
    
    
    // Methods for field "company_Spare_cnt"
    public long getCompany_Spare_cnt()
    {
	return ((INTEGER)mComponents[8]).longValue();
    }
    
    public void setCompany_Spare_cnt(long company_Spare_cnt)
    {
	setCompany_Spare_cnt(new INTEGER(company_Spare_cnt));
    }
    
    public void setCompany_Spare_cnt(INTEGER company_Spare_cnt)
    {
	mComponents[8] = company_Spare_cnt;
    }
    
    
    // Methods for field "company_Admin_id"
    public UTF8String16 getCompany_Admin_id()
    {
	return (UTF8String16)mComponents[9];
    }
    
    public void setCompany_Admin_id(UTF8String16 company_Admin_id)
    {
	mComponents[9] = company_Admin_id;
    }
    
    
    // Methods for field "company_Reg_date"
    public UTF8String16 getCompany_Reg_date()
    {
	return (UTF8String16)mComponents[10];
    }
    
    public void setCompany_Reg_date(UTF8String16 company_Reg_date)
    {
	mComponents[10] = company_Reg_date;
    }
    
    
    // Methods for field "company_Remark"
    public UTF8String16 getCompany_Remark()
    {
	return (UTF8String16)mComponents[11];
    }
    
    public void setCompany_Remark(UTF8String16 company_Remark)
    {
	mComponents[11] = company_Remark;
    }
    
    public boolean hasCompany_Remark()
    {
	return componentIsPresent(11);
    }
    
    public void deleteCompany_Remark()
    {
	setComponentAbsent(11);
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
	    "Company"
	),
	new QName (
	    "BusInfomation",
	    "Company"
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
					new INTEGER(9),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "trnt-Company-id",
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
					new INTEGER(30),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "company-Company-nm",
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
					new INTEGER(14),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "company-Phone-no",
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
					new INTEGER(14),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "company-Fax-no",
		    3,
		    3,
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
					new INTEGER(100),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "company-Address",
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
					new INTEGER(30),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "company-Ceo-nm",
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
				    new INTEGER(9999),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "company-Bus-cnt",
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
				    new INTEGER(9999),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "company-Reg-cnt",
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
				    new INTEGER(9999),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "company-Spare-cnt",
		    8,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
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
		    "company-Admin-id",
		    9,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
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
		    "company-Reg-date",
		    10,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
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
		    "company-Remark",
		    11,
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
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
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
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Company object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Company object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Company
