/*
 * Copyright (c) 1996, 2005, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 */

/*
 * (C) Copyright Taligent, Inc. 1996, 1997 - All Rights Reserved
 * (C) Copyright IBM Corp. 1996 - 1998 - All Rights Reserved
 *
 * The original version of this source code and documentation
 * is copyrighted and owned by Taligent, Inc., a wholly-owned
 * subsidiary of IBM. These materials are provided under terms
 * of a License Agreement between Taligent and Sun. This technology
 * is protected by multiple US and International patents.
 *
 * This notice and attribution to Taligent may not be removed.
 * Taligent is a registered trademark of Taligent, Inc.
 *
 */

package sun.text.resources;

import java.util.ListResourceBundle;

public class FormatData_de_AT extends ListResourceBundle {
    /**
     * Overrides ListResourceBundle
     */
    protected final Object[][] getContents() {
        return new Object[][] { { "MonthNames", new String[] { "J\u00e4nner", // january
            "Februar", // february
            "M\u00e4rz", // march
            "April", // april
            "Mai", // may
            "Juni", // june
            "Juli", // july
            "August", // august
            "September", // september
            "Oktober", // october
            "November", // november
            "Dezember", // december
            "" // month 13 if applicable
        } }, { "MonthAbbreviations", new String[] { "J\u00e4n", // abb january
            "Feb", // abb february
            "M\u00e4r", // abb march
            "Apr", // abb april
            "Mai", // abb may
            "Jun", // abb june
            "Jul", // abb july
            "Aug", // abb august
            "Sep", // abb september
            "Okt", // abb october
            "Nov", // abb november
            "Dez", // abb december
            "" // abb month 13 if applicable
        } }, { "NumberPatterns", new String[] { "#,##0.###;-#,##0.###", // decimal pattern
            "\u00A4 #,##0.00;-\u00A4 #,##0.00", // currency pattern
            "#,##0%" // percent pattern
        } }, { "DateTimePatterns", new String[] { "HH:mm' Uhr 'z", // full time pattern
            "HH:mm:ss z", // long time pattern
            "HH:mm:ss", // medium time pattern
            "HH:mm", // short time pattern
            "EEEE, dd. MMMM yyyy", // full date pattern
            "dd. MMMM yyyy", // long date pattern
            "dd.MM.yyyy", // medium date pattern
            "dd.MM.yy", // short date pattern
            "{1} {0}" // date-time pattern
        } }, { "DateTimePatternChars", "GuMtkHmsSEDFwWahKzZ" }, };
    }
}
