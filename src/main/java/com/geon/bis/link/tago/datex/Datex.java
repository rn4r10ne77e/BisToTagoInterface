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


package com.geon.bis.link.tago.datex;

import com.oss.asn1.ASN1Project;
import com.oss.asn1.BERCoder;
import com.oss.asn1.Coder;
import com.oss.metadata.ProjectInfo;

public class Datex extends ASN1Project {

    /**
     * Initialize the pdu decoder.
     */
    private static final ProjectInfo c_projectInfo = new ProjectInfo (
	null,
	new byte[] {
	    (byte)0x0b, (byte)0x39, (byte)0x77, (byte)0x78, (byte)0x3b,
	    (byte)0x15, (byte)0x22, (byte)0xd7, (byte)0x89, (byte)0x14,
	    (byte)0x22, (byte)0xd7, (byte)0x89, (byte)0x15, (byte)0x05,
	    (byte)0x71, (byte)0x9c, (byte)0xee, (byte)0xf4, (byte)0xf9,
	    (byte)0x9d, (byte)0x85, (byte)0xaa, (byte)0x8b, (byte)0x45,
	    (byte)0xb5, (byte)0x45, (byte)0xe0, (byte)0x4d, (byte)0x97,
	    (byte)0x06, (byte)0x37, (byte)0xa5, (byte)0x75, (byte)0xbb,
	    (byte)0xc7, (byte)0x4e, (byte)0x99, (byte)0x54, (byte)0x1e,
	    (byte)0x8c, (byte)0x99, (byte)0x25, (byte)0xd5, (byte)0xc3,
	    (byte)0x84, (byte)0xd3, (byte)0x6c, (byte)0x86, (byte)0x2f,
	    (byte)0x07, (byte)0x1c, (byte)0xa0, (byte)0x42, (byte)0xdb,
	    (byte)0x1b, (byte)0xed, (byte)0xc5, (byte)0x1d, (byte)0x26,
	    (byte)0xe2, (byte)0x25, (byte)0xf2, (byte)0x07, (byte)0xd2,
	    (byte)0x40, (byte)0x3d, (byte)0x25, (byte)0x23, (byte)0x04,
	    (byte)0x10, (byte)0x7a, (byte)0x91, (byte)0x4e, (byte)0x27,
	    (byte)0x3c, (byte)0x74, (byte)0x22, (byte)0xea, (byte)0x8b,
	    (byte)0xb1, (byte)0x45, (byte)0x0d, (byte)0xd5, (byte)0xae,
	    (byte)0xbb, (byte)0xc6, (byte)0xde, (byte)0x5f, (byte)0xa7,
	    (byte)0xb4, (byte)0x9c, (byte)0xc3, (byte)0xce, (byte)0x97,
	    (byte)0x3b, (byte)0x8e, (byte)0x60
	}
    );
    
    /**
     * Get the project descriptor of 'this' object.
     */
    public ProjectInfo getProjectInfo()
    {
	return c_projectInfo;
    }
    
    private static final ASN1Project c_project = new Datex();

    /**
     * Methods for accessing Coders.
     */
    public static Coder getDefaultCoder()
    {
	return createBERCoder(c_project);
    }
    
    public static BERCoder getBERCoder()
    {
	return createBERCoder(c_project);
    }
    
}
