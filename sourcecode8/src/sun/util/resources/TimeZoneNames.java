/*
 * Copyright (c) 1996, 2013, Oracle and/or its affiliates. All rights reserved.
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

package sun.util.resources;

public final class TimeZoneNames extends TimeZoneNamesBundle {

    protected final Object[][] getContents() {
        // Note: generic names came from CLDR with some adjustments.
        String ACT[] = new String[] { "Acre Time", "ACT", "Acre Summer Time", "ACST", "Acre Time", "ACT" };
        String ADELAIDE[] = new String[] { "Central Standard Time (South Australia)", "CST",
            "Central Summer Time (South Australia)", "CST", "Central Time (South Australia)", "CT" };
        String AGT[] = new String[] { "Argentine Time", "ART", "Argentine Summer Time", "ARST", "Argentine Time",
            "ART" };
        String AKST[] = new String[] { "Alaska Standard Time", "AKST", "Alaska Daylight Time", "AKDT", "Alaska Time",
            "AKT" };
        String AMT[] = new String[] { "Amazon Time", "AMT", "Amazon Summer Time", "AMST", "Amazon Time", "AMT" };
        String ARAST[] = new String[] { "Arabia Standard Time", "AST", "Arabia Daylight Time", "ADT", "Arabia Time",
            "AT" };
        String ARMT[] = new String[] { "Armenia Time", "AMT", "Armenia Summer Time", "AMST", "Armenia Time", "AMT" };
        String AST[] = new String[] { "Atlantic Standard Time", "AST", "Atlantic Daylight Time", "ADT", "Atlantic Time",
            "AT" };
        String BDT[] = new String[] { "Bangladesh Time", "BDT", "Bangladesh Summer Time", "BDST", "Bangladesh Time",
            "BDT" };
        String BRISBANE[] = new String[] { "Eastern Standard Time (Queensland)", "EST",
            "Eastern Summer Time (Queensland)", "EST", "Eastern Time (Queensland)", "ET" };
        String BROKEN_HILL[] = new String[] { "Central Standard Time (South Australia/New South Wales)", "CST",
            "Central Summer Time (South Australia/New South Wales)", "CST",
            "Central Time (South Australia/New South Wales)", "CT" };
        String BRT[] = new String[] { "Brasilia Time", "BRT", "Brasilia Summer Time", "BRST", "Brasilia Time", "BRT" };
        String BTT[] = new String[] { "Bhutan Time", "BTT", "Bhutan Summer Time", "BTST", "Bhutan Time", "BTT" };
        String CAT[] = new String[] { "Central African Time", "CAT", "Central African Summer Time", "CAST",
            "Central Africa Time", "CAT" };
        String CET[] = new String[] { "Central European Time", "CET", "Central European Summer Time", "CEST",
            "Central European Time", "CET" };
        String CHAST[] = new String[] { "Chatham Standard Time", "CHAST", "Chatham Daylight Time", "CHADT",
            "Chatham Time", "CHAT" };
        String CHUT[] = new String[] { "Chuuk Time", "CHUT", "Chuuk Summer Time", "CHUST", "Chuuk Time", "CHUT" };
        String CIT[] = new String[] { "Central Indonesia Time", "WITA", "Central Indonesia Summer Time", "CIST",
            "Central Indonesia Time", "WITA" };
        String CLT[] = new String[] { "Chile Time", "CLT", "Chile Summer Time", "CLST", "Chile Time", "CLT" };
        String CST[] = new String[] { "Central Standard Time", "CST", "Central Daylight Time", "CDT", "Central Time",
            "CT" };
        String CTT[] = new String[] { "China Standard Time", "CST", "China Daylight Time", "CDT", "China Time", "CT" };
        String CUBA[] = new String[] { "Cuba Standard Time", "CST", "Cuba Daylight Time", "CDT", "Cuba Time", "CT" };
        String DARWIN[] = new String[] { "Central Standard Time (Northern Territory)", "CST",
            "Central Summer Time (Northern Territory)", "CST", "Central Time (Northern Territory)", "CT" };
        String DUBLIN[] = new String[] { "Greenwich Mean Time", "GMT", "Irish Summer Time", "IST", "Irish Time", "IT" };
        String EAT[] = new String[] { "Eastern African Time", "EAT", "Eastern African Summer Time", "EAST",
            "Eastern Africa Time", "EAT" };
        String EASTER[] = new String[] { "Easter Is. Time", "EAST", "Easter Is. Summer Time", "EASST",
            "Easter Is. Time", "EAST" };
        String EET[] = new String[] { "Eastern European Time", "EET", "Eastern European Summer Time", "EEST",
            "Eastern European Time", "EET" };
        String EGT[] = new String[] { "Eastern Greenland Time", "EGT", "Eastern Greenland Summer Time", "EGST",
            "Eastern Greenland Time", "EGT" };
        String EST[] = new String[] { "Eastern Standard Time", "EST", "Eastern Daylight Time", "EDT", "Eastern Time",
            "ET" };
        String EST_NSW[] = new String[] { "Eastern Standard Time (New South Wales)", "EST",
            "Eastern Summer Time (New South Wales)", "EST", "Eastern Time (New South Wales)", "ET" };
        String FET[] = new String[] { "Further-eastern European Time", "FET", "Further-eastern European Summer Time",
            "FEST", "Further-eastern European Time", "FET" };
        String GHMT[] = new String[] { "Ghana Mean Time", "GMT", "Ghana Summer Time", "GHST", "Ghana Mean Time",
            "GMT" };
        String GAMBIER[] = new String[] { "Gambier Time", "GAMT", "Gambier Summer Time", "GAMST", "Gambier Time",
            "GAMT" };
        String GMT[] = new String[] { "Greenwich Mean Time", "GMT", "Greenwich Mean Time", "GMT", "Greenwich Mean Time",
            "GMT" };
        String GMTBST[] = new String[] { "Greenwich Mean Time", "GMT", "British Summer Time", "BST", "British Time",
            "BT" };
        String GST[] = new String[] { "Gulf Standard Time", "GST", "Gulf Daylight Time", "GDT", "Gulf Time", "GT" };
        String HAST[] = new String[] { "Hawaii-Aleutian Standard Time", "HAST", "Hawaii-Aleutian Daylight Time", "HADT",
            "Hawaii-Aleutian Time", "HAT" };
        String HKT[] = new String[] { "Hong Kong Time", "HKT", "Hong Kong Summer Time", "HKST", "Hong Kong Time",
            "HKT" };
        String HST[] = new String[] { "Hawaii Standard Time", "HST", "Hawaii Daylight Time", "HDT", "Hawaii Time",
            "HT" };
        String ICT[] = new String[] { "Indochina Time", "ICT", "Indochina Summer Time", "ICST", "Indochina Time",
            "ICT" };
        String IRT[] = new String[] { "Iran Standard Time", "IRST", "Iran Daylight Time", "IRDT", "Iran Time", "IRT" };
        String ISRAEL[] = new String[] { "Israel Standard Time", "IST", "Israel Daylight Time", "IDT", "Israel Time",
            "IT" };
        String IST[] = new String[] { "India Standard Time", "IST", "India Daylight Time", "IDT", "India Time", "IT" };
        String JST[] = new String[] { "Japan Standard Time", "JST", "Japan Daylight Time", "JDT", "Japan Time", "JT" };
        String KST[] = new String[] { "Korea Standard Time", "KST", "Korea Daylight Time", "KDT", "Korea Time", "KT" };
        String LORD_HOWE[] = new String[] { "Lord Howe Standard Time", "LHST", "Lord Howe Summer Time", "LHST",
            "Lord Howe Time", "LHT" };
        String MHT[] = new String[] { "Marshall Islands Time", "MHT", "Marshall Islands Summer Time", "MHST",
            "Marshall Islands Time", "MHT" };
        String MSK[] = new String[] { "Moscow Standard Time", "MSK", "Moscow Daylight Time", "MSD", "Moscow Time",
            "MT" };
        String MST[] = new String[] { "Mountain Standard Time", "MST", "Mountain Daylight Time", "MDT", "Mountain Time",
            "MT" };
        String MYT[] = new String[] { "Malaysia Time", "MYT", "Malaysia Summer Time", "MYST", "Malaysia Time", "MYT" };
        String NORONHA[] = new String[] { "Fernando de Noronha Time", "FNT", "Fernando de Noronha Summer Time", "FNST",
            "Fernando de Noronha Time", "FNT" };
        String NOVT[] = new String[] { "Novosibirsk Time", "NOVT", "Novosibirsk Summer Time", "NOVST",
            "Novosibirsk Time", "NOVT" };
        String NPT[] = new String[] { "Nepal Time", "NPT", "Nepal Summer Time", "NPST", "Nepal Time", "NPT" };
        String NST[] = new String[] { "Newfoundland Standard Time", "NST", "Newfoundland Daylight Time", "NDT",
            "Newfoundland Time", "NT" };
        String NZST[] = new String[] { "New Zealand Standard Time", "NZST", "New Zealand Daylight Time", "NZDT",
            "New Zealand Time", "NZT" };
        String PITCAIRN[] = new String[] { "Pitcairn Standard Time", "PST", "Pitcairn Daylight Time", "PDT",
            "Pitcairn Time", "PT" };
        String PKT[] = new String[] { "Pakistan Time", "PKT", "Pakistan Summer Time", "PKST", "Pakistan Time", "PKT" };
        String PONT[] = new String[] { "Pohnpei Time", "PONT", "Pohnpei Summer Time", "PONST", "Ponape Time", "PONT" };
        String PST[] = new String[] { "Pacific Standard Time", "PST", "Pacific Daylight Time", "PDT", "Pacific Time",
            "PT" };
        String SAST[] = new String[] { "South Africa Standard Time", "SAST", "South Africa Summer Time", "SAST",
            "South Africa Time", "SAT" };
        String SBT[] = new String[] { "Solomon Is. Time", "SBT", "Solomon Is. Summer Time", "SBST", "Solomon Is. Time",
            "SBT" };
        String SGT[] = new String[] { "Singapore Time", "SGT", "Singapore Summer Time", "SGST", "Singapore Time",
            "SGT" };
        String SLST[] = new String[] { "Greenwich Mean Time", "GMT", "Sierra Leone Summer Time", "SLST",
            "Sierra Leone Time", "SLT" };
        String TASMANIA[] = new String[] { "Eastern Standard Time (Tasmania)", "EST", "Eastern Summer Time (Tasmania)",
            "EST", "Eastern Time (Tasmania)", "ET" };
        String TMT[] = new String[] { "Turkmenistan Time", "TMT", "Turkmenistan Summer Time", "TMST",
            "Turkmenistan Time", "TMT" };
        String ULAT[] = new String[] { "Ulaanbaatar Time", "ULAT", "Ulaanbaatar Summer Time", "ULAST",
            "Ulaanbaatar Time", "ULAT" };
        String WART[] = new String[] { "Western Argentine Time", "WART", "Western Argentine Summer Time", "WARST",
            "Western Argentine Time", "WART" };
        String WAT[] = new String[] { "Western African Time", "WAT", "Western African Summer Time", "WAST",
            "Western African Time", "WAT" };
        String WET[] = new String[] { "Western European Time", "WET", "Western European Summer Time", "WEST",
            "Western European Time", "WET" };
        String WIT[] = new String[] { "West Indonesia Time", "WIB", "West Indonesia Summer Time", "WIST",
            "West Indonesia Time", "WIB" };
        String WST_AUS[] = new String[] { "Western Standard Time (Australia)", "WST", "Western Summer Time (Australia)",
            "WST", "Western Time (Australia)", "WT" };
        String SAMOA[] = new String[] { "Samoa Standard Time", "SST", "Samoa Daylight Time", "SDT", "Samoa Time",
            "ST" };
        String WST_SAMOA[] = new String[] { "West Samoa Time", "WST", "West Samoa Daylight Time", "WSDT",
            "West Samoa Time", "WST" };
        String ChST[] = new String[] { "Chamorro Standard Time", "ChST", "Chamorro Daylight Time", "ChDT",
            "Chamorro Time", "ChT" };
        String VICTORIA[] = new String[] { "Eastern Standard Time (Victoria)", "EST", "Eastern Summer Time (Victoria)",
            "EST", "Eastern Time (Victoria)", "ET" };
        String UTC[] = new String[] { "Coordinated Universal Time", "UTC", "Coordinated Universal Time", "UTC",
            "Coordinated Universal Time", "UTC" };
        String UZT[] = new String[] { "Uzbekistan Time", "UZT", "Uzbekistan Summer Time", "UZST", "Uzbekistan Time",
            "UZT" };

        return new Object[][] { { "America/Los_Angeles", PST }, { "PST", PST }, { "America/Denver", MST },
            { "MST", MST }, { "America/Phoenix", MST }, { "PNT", MST }, { "America/Chicago", CST }, { "CST", CST },
            { "America/New_York", EST }, { "EST", EST }, { "America/Indianapolis", EST }, { "IET", EST },
            { "Pacific/Honolulu", HST }, { "HST", HST }, { "America/Anchorage", AKST }, { "AST", AKST },
            { "America/Halifax", AST }, { "America/Sitka", AKST }, { "America/St_Johns", NST }, { "CNT", NST },
            { "Europe/Paris", CET }, { "ECT", CET }, { "GMT", GMT }, { "Africa/Casablanca", WET },
            { "Asia/Jerusalem", ISRAEL }, { "Asia/Tokyo", JST }, { "JST", JST }, { "Europe/Bucharest", EET },
            { "Asia/Shanghai", CTT }, { "CTT", CTT },
            /* Don't change the order of the above zones
             * to keep compatibility with the previous version.
             */

            { "ACT", DARWIN }, { "AET", EST_NSW }, { "AGT", AGT }, { "ART", EET }, { "Africa/Abidjan", GMT },
            { "Africa/Accra", GHMT }, { "Africa/Addis_Ababa", EAT }, { "Africa/Algiers", CET },
            { "Africa/Asmara", EAT }, { "Africa/Asmera", EAT }, { "Africa/Bamako", GMT }, { "Africa/Bangui", WAT },
            { "Africa/Banjul", GMT }, { "Africa/Bissau", GMT }, { "Africa/Blantyre", CAT },
            { "Africa/Brazzaville", WAT }, { "Africa/Bujumbura", CAT }, { "Africa/Cairo", EET },
            { "Africa/Ceuta", CET }, { "Africa/Conakry", GMT }, { "Africa/Dakar", GMT },
            { "Africa/Dar_es_Salaam", EAT }, { "Africa/Djibouti", EAT }, { "Africa/Douala", WAT },
            { "Africa/El_Aaiun", WET }, { "Africa/Freetown", SLST }, { "Africa/Gaborone", CAT },
            { "Africa/Harare", CAT }, { "Africa/Johannesburg", SAST }, { "Africa/Juba", EAT },
            { "Africa/Kampala", EAT }, { "Africa/Khartoum", EAT }, { "Africa/Kigali", CAT }, { "Africa/Kinshasa", WAT },
            { "Africa/Lagos", WAT }, { "Africa/Libreville", WAT }, { "Africa/Lome", GMT }, { "Africa/Luanda", WAT },
            { "Africa/Lubumbashi", CAT }, { "Africa/Lusaka", CAT }, { "Africa/Malabo", WAT }, { "Africa/Maputo", CAT },
            { "Africa/Maseru", SAST }, { "Africa/Mbabane", SAST }, { "Africa/Mogadishu", EAT },
            { "Africa/Monrovia", GMT }, { "Africa/Nairobi", EAT }, { "Africa/Ndjamena", WAT }, { "Africa/Niamey", WAT },
            { "Africa/Nouakchott", GMT }, { "Africa/Ouagadougou", GMT }, { "Africa/Porto-Novo", WAT },
            { "Africa/Sao_Tome", GMT }, { "Africa/Timbuktu", GMT }, { "Africa/Tripoli", EET }, { "Africa/Tunis", CET },
            { "Africa/Windhoek", WAT }, { "America/Adak", HAST }, { "America/Anguilla", AST },
            { "America/Antigua", AST }, { "America/Araguaina", BRT }, { "America/Argentina/Buenos_Aires", AGT },
            { "America/Argentina/Catamarca", AGT }, { "America/Argentina/ComodRivadavia", AGT },
            { "America/Argentina/Cordoba", AGT }, { "America/Argentina/Jujuy", AGT },
            { "America/Argentina/La_Rioja", AGT }, { "America/Argentina/Mendoza", AGT },
            { "America/Argentina/Rio_Gallegos", AGT }, { "America/Argentina/Salta", AGT },
            { "America/Argentina/San_Juan", AGT }, { "America/Argentina/San_Luis", AGT },
            { "America/Argentina/Tucuman", AGT }, { "America/Argentina/Ushuaia", AGT }, { "America/Aruba", AST },
            { "America/Asuncion",
                new String[] { "Paraguay Time", "PYT", "Paraguay Summer Time", "PYST", "Paraguay Time", "PYT" } },
            { "America/Atikokan", EST }, { "America/Atka", HAST }, { "America/Bahia", BRT },
            { "America/Bahia_Banderas", CST }, { "America/Barbados", AST }, { "America/Belem", BRT },
            { "America/Belize", CST }, { "America/Blanc-Sablon", AST }, { "America/Boa_Vista", AMT },
            { "America/Bogota",
                new String[] { "Colombia Time", "COT", "Colombia Summer Time", "COST", "Colombia Time", "COT" } },
            { "America/Boise", MST }, { "America/Buenos_Aires", AGT }, { "America/Cambridge_Bay", MST },
            { "America/Campo_Grande", AMT }, { "America/Cancun", CST }, { "America/Caracas",
            new String[] { "Venezuela Time", "VET", "Venezuela Summer Time", "VEST", "Venezuela Time", "VET" } },
            { "America/Catamarca", AGT }, { "America/Cayenne",
            new String[] { "French Guiana Time", "GFT", "French Guiana Summer Time", "GFST", "French Guiana Time",
                "GFT" } }, { "America/Cayman", EST }, { "America/Chihuahua", MST }, { "America/Creston", MST },
            { "America/Coral_Harbour", EST }, { "America/Cordoba", AGT }, { "America/Costa_Rica", CST },
            { "America/Cuiaba", AMT }, { "America/Curacao", AST }, { "America/Danmarkshavn", GMT },
            { "America/Dawson", PST }, { "America/Dawson_Creek", MST }, { "America/Detroit", EST },
            { "America/Dominica", AST }, { "America/Edmonton", MST }, { "America/Eirunepe", ACT },
            { "America/El_Salvador", CST }, { "America/Ensenada", PST }, { "America/Fort_Wayne", EST },
            { "America/Fortaleza", BRT }, { "America/Glace_Bay", AST }, { "America/Godthab",
            new String[] { "Western Greenland Time", "WGT", "Western Greenland Summer Time", "WGST",
                "Western Greenland Time", "WGT" } }, { "America/Goose_Bay", AST }, { "America/Grand_Turk", EST },
            { "America/Grenada", AST }, { "America/Guadeloupe", AST }, { "America/Guatemala", CST },
            { "America/Guayaquil",
                new String[] { "Ecuador Time", "ECT", "Ecuador Summer Time", "ECST", "Ecuador Time", "ECT" } },
            { "America/Guyana",
                new String[] { "Guyana Time", "GYT", "Guyana Summer Time", "GYST", "Guyana Time", "GYT" } },
            { "America/Havana", CUBA }, { "America/Hermosillo", MST }, { "America/Indiana/Indianapolis", EST },
            { "America/Indiana/Knox", CST }, { "America/Indiana/Marengo", EST }, { "America/Indiana/Petersburg", EST },
            { "America/Indiana/Tell_City", CST }, { "America/Indiana/Vevay", EST },
            { "America/Indiana/Vincennes", EST }, { "America/Indiana/Winamac", EST }, { "America/Inuvik", MST },
            { "America/Iqaluit", EST }, { "America/Jamaica", EST }, { "America/Jujuy", AGT },
            { "America/Juneau", AKST }, { "America/Kentucky/Louisville", EST }, { "America/Kentucky/Monticello", EST },
            { "America/Knox_IN", CST }, { "America/Kralendijk", AST }, { "America/La_Paz",
            new String[] { "Bolivia Time", "BOT", "Bolivia Summer Time", "BOST", "Bolivia Time", "BOT" } },
            { "America/Lima", new String[] { "Peru Time", "PET", "Peru Summer Time", "PEST", "Peru Time", "PET" } },
            { "America/Louisville", EST }, { "America/Lower_Princes", AST }, { "America/Maceio", BRT },
            { "America/Managua", CST }, { "America/Manaus", AMT }, { "America/Marigot", AST },
            { "America/Martinique", AST }, { "America/Matamoros", CST }, { "America/Mazatlan", MST },
            { "America/Mendoza", AGT }, { "America/Menominee", CST }, { "America/Merida", CST }, { "America/Metlakatla",
            new String[] { "Metlakatla Standard Time", "MeST", "Metlakatla Daylight Time", "MeDT", "Metlakatla Time",
                "MeT" } }, { "America/Mexico_City", CST }, { "America/Miquelon",
            new String[] { "Pierre & Miquelon Standard Time", "PMST", "Pierre & Miquelon Daylight Time", "PMDT",
                "Pierre & Miquelon Time", "PMT" } }, { "America/Moncton", AST }, { "America/Montevideo",
            new String[] { "Uruguay Time", "UYT", "Uruguay Summer Time", "UYST", "Uruguay Time", "UYT" } },
            { "America/Monterrey", CST }, { "America/Montreal", EST }, { "America/Montserrat", AST },
            { "America/Nassau", EST }, { "America/Nipigon", EST }, { "America/Nome", AKST },
            { "America/Noronha", NORONHA }, { "America/North_Dakota/Beulah", CST },
            { "America/North_Dakota/Center", CST }, { "America/North_Dakota/New_Salem", CST },
            { "America/Ojinaga", MST }, { "America/Panama", EST }, { "America/Pangnirtung", EST },
            { "America/Paramaribo",
                new String[] { "Suriname Time", "SRT", "Suriname Summer Time", "SRST", "Suriname Time", "SRT" } },
            { "America/Port-au-Prince", EST }, { "America/Port_of_Spain", AST }, { "America/Porto_Acre", ACT },
            { "America/Porto_Velho", AMT }, { "America/Puerto_Rico", AST }, { "America/Rainy_River", CST },
            { "America/Rankin_Inlet", CST }, { "America/Recife", BRT }, { "America/Regina", CST },
            { "America/Resolute", CST }, { "America/Rio_Branco", ACT }, { "America/Rosario", AGT },
            { "America/Santa_Isabel", PST }, { "America/Santarem", BRT }, { "America/Santiago", CLT },
            { "America/Santo_Domingo", AST }, { "America/Sao_Paulo", BRT }, { "America/Scoresbysund", EGT },
            { "America/Shiprock", MST }, { "America/St_Barthelemy", AST }, { "America/St_Kitts", AST },
            { "America/St_Lucia", AST }, { "America/St_Thomas", AST }, { "America/St_Vincent", AST },
            { "America/Swift_Current", CST }, { "America/Tegucigalpa", CST }, { "America/Thule", AST },
            { "America/Thunder_Bay", EST }, { "America/Tijuana", PST }, { "America/Toronto", EST },
            { "America/Tortola", AST }, { "America/Vancouver", PST }, { "America/Virgin", AST },
            { "America/Whitehorse", PST }, { "America/Winnipeg", CST }, { "America/Yakutat", AKST },
            { "America/Yellowknife", MST }, { "Antarctica/Casey", WST_AUS }, { "Antarctica/Davis",
            new String[] { "Davis Time", "DAVT", "Davis Summer Time", "DAVST", "Davis Time", "DAVT" } },
            { "Antarctica/DumontDUrville",
                new String[] { "Dumont-d'Urville Time", "DDUT", "Dumont-d'Urville Summer Time", "DDUST",
                    "Dumont-d'Urville Time", "DDUT" } }, { "Antarctica/Macquarie",
            new String[] { "Macquarie Island Time", "MIST", "Macquarie Island Summer Time", "MIST",
                "Macquarie Island Time", "MIST" } }, { "Antarctica/Mawson",
            new String[] { "Mawson Time", "MAWT", "Mawson Summer Time", "MAWST", "Mawson Time", "MAWT" } },
            { "Antarctica/McMurdo", NZST }, { "Antarctica/Palmer", CLT }, { "Antarctica/Rothera",
            new String[] { "Rothera Time", "ROTT", "Rothera Summer Time", "ROTST", "Rothera Time", "ROTT" } },
            { "Antarctica/South_Pole", NZST }, { "Antarctica/Syowa",
            new String[] { "Syowa Time", "SYOT", "Syowa Summer Time", "SYOST", "Syowa Time", "SYOT" } },
            { "Antarctica/Vostok",
                new String[] { "Vostok Time", "VOST", "Vostok Summer Time", "VOSST", "Vostok Time", "VOST" } },
            { "Arctic/Longyearbyen", CET }, { "Asia/Aden", ARAST }, { "Asia/Almaty",
            new String[] { "Alma-Ata Time", "ALMT", "Alma-Ata Summer Time", "ALMST", "Alma-Ata Time", "ALMT" } },
            { "Asia/Amman", ARAST }, { "Asia/Anadyr",
            new String[] { "Anadyr Time", "ANAT", "Anadyr Summer Time", "ANAST", "Anadyr Time", "ANAT" } },
            { "Asia/Aqtau", new String[] { "Aqtau Time", "AQTT", "Aqtau Summer Time", "AQTST", "Aqtau Time", "AQTT" } },
            { "Asia/Aqtobe",
                new String[] { "Aqtobe Time", "AQTT", "Aqtobe Summer Time", "AQTST", "Aqtobe Time", "AQTT" } },
            { "Asia/Ashgabat", TMT }, { "Asia/Ashkhabad", TMT }, { "Asia/Baghdad", ARAST }, { "Asia/Bahrain", ARAST },
            { "Asia/Baku",
                new String[] { "Azerbaijan Time", "AZT", "Azerbaijan Summer Time", "AZST", "Azerbaijan Time", "AZT" } },
            { "Asia/Bangkok", ICT }, { "Asia/Beirut", EET }, { "Asia/Bishkek",
            new String[] { "Kirgizstan Time", "KGT", "Kirgizstan Summer Time", "KGST", "Kirgizstan Time", "KGT" } },
            { "Asia/Brunei",
                new String[] { "Brunei Time", "BNT", "Brunei Summer Time", "BNST", "Brunei Time", "BNT" } },
            { "Asia/Calcutta", IST }, { "Asia/Choibalsan",
            new String[] { "Choibalsan Time", "CHOT", "Choibalsan Summer Time", "CHOST", "Choibalsan Time", "CHOT" } },
            { "Asia/Chongqing", CTT }, { "Asia/Chungking", CTT }, { "Asia/Colombo", IST }, { "Asia/Dacca", BDT },
            { "Asia/Dhaka", BDT }, { "Asia/Dili",
            new String[] { "Timor-Leste Time", "TLT", "Timor-Leste Summer Time", "TLST", "Timor-Leste Time", "TLT" } },
            { "Asia/Damascus", EET }, { "Asia/Dubai", GST }, { "Asia/Dushanbe",
            new String[] { "Tajikistan Time", "TJT", "Tajikistan Summer Time", "TJST", "Tajikistan Time", "TJT" } },
            { "Asia/Gaza", EET }, { "Asia/Harbin", CTT }, { "Asia/Hebron", EET }, { "Asia/Ho_Chi_Minh", ICT },
            { "Asia/Hong_Kong", HKT },
            { "Asia/Hovd", new String[] { "Hovd Time", "HOVT", "Hovd Summer Time", "HOVST", "Hovd Time", "HOVT" } },
            { "Asia/Irkutsk",
                new String[] { "Irkutsk Time", "IRKT", "Irkutsk Summer Time", "IRKST", "Irkutsk Time", "IRKT" } },
            { "Asia/Istanbul", EET }, { "Asia/Jakarta", WIT }, { "Asia/Jayapura",
            new String[] { "East Indonesia Time", "WIT", "East Indonesia Summer Time", "EIST", "East Indonesia Time",
                "WIT" } }, { "Asia/Kabul",
            new String[] { "Afghanistan Time", "AFT", "Afghanistan Summer Time", "AFST", "Afghanistan Time", "AFT" } },
            { "Asia/Kamchatka",
                new String[] { "Petropavlovsk-Kamchatski Time", "PETT", "Petropavlovsk-Kamchatski Summer Time", "PETST",
                    "Petropavlovsk-Kamchatski Time", "PETT" } }, { "Asia/Karachi", PKT }, { "Asia/Kashgar", CTT },
            { "Asia/Kathmandu", NPT }, { "Asia/Katmandu", NPT }, { "Asia/Khandyga",
            new String[] { "Khandyga Time", "YAKT", "Khandyga Summer Time", "YAKST", "Khandyga Time", "YAKT" } },

            { "Asia/Kolkata", IST }, { "Asia/Krasnoyarsk",
            new String[] { "Krasnoyarsk Time", "KRAT", "Krasnoyarsk Summer Time", "KRAST", "Krasnoyarsk Time",
                "KRAT" } }, { "Asia/Kuala_Lumpur", MYT }, { "Asia/Kuching", MYT }, { "Asia/Kuwait", ARAST },
            { "Asia/Macao", CTT }, { "Asia/Macau", CTT }, { "Asia/Magadan",
            new String[] { "Magadan Time", "MAGT", "Magadan Summer Time", "MAGST", "Magadan Time", "MAGT" } },
            { "Asia/Makassar", CIT }, { "Asia/Manila",
            new String[] { "Philippines Time", "PHT", "Philippines Summer Time", "PHST", "Philippines Time", "PHT" } },
            { "Asia/Muscat", GST }, { "Asia/Nicosia", EET }, { "Asia/Novokuznetsk", NOVT },
            { "Asia/Novosibirsk", NOVT },
            { "Asia/Oral", new String[] { "Oral Time", "ORAT", "Oral Summer Time", "ORAST", "Oral Time", "ORAT" } },
            { "Asia/Omsk", new String[] { "Omsk Time", "OMST", "Omsk Summer Time", "OMSST", "Omsk Time", "OMST" } },
            { "Asia/Phnom_Penh", ICT }, { "Asia/Pontianak", WIT }, { "Asia/Pyongyang", KST }, { "Asia/Qatar", ARAST },
            { "Asia/Qyzylorda",
                new String[] { "Qyzylorda Time", "QYZT", "Qyzylorda Summer Time", "QYZST", "Qyzylorda Time", "QYZT" } },
            { "Asia/Rangoon",
                new String[] { "Myanmar Time", "MMT", "Myanmar Summer Time", "MMST", "Myanmar Time", "MMT" } },
            { "Asia/Riyadh", ARAST }, { "Asia/Saigon", ICT }, { "Asia/Sakhalin",
            new String[] { "Sakhalin Time", "SAKT", "Sakhalin Summer Time", "SAKST", "Sakhalin Time", "SAKT" } },
            { "Asia/Samarkand", UZT }, { "Asia/Seoul", KST }, { "Asia/Singapore", SGT }, { "Asia/Taipei", CTT },
            { "Asia/Tel_Aviv", ISRAEL }, { "Asia/Tashkent", UZT }, { "Asia/Tbilisi",
            new String[] { "Georgia Time", "GET", "Georgia Summer Time", "GEST", "Georgia Time", "GET" } },
            { "Asia/Tehran", IRT }, { "Asia/Thimbu", BTT }, { "Asia/Thimphu", BTT }, { "Asia/Ujung_Pandang", CIT },
            { "Asia/Ulaanbaatar", ULAT }, { "Asia/Ulan_Bator", ULAT }, { "Asia/Urumqi", CTT }, { "Asia/Ust-Nera",
            new String[] { "Ust-Nera Time", "VLAT", "Ust-Nera Summer Time", "VLAST", "Ust-Nera Time", "VLAT" } },
            { "Asia/Vientiane", ICT }, { "Asia/Vladivostok",
            new String[] { "Vladivostok Time", "VLAT", "Vladivostok Summer Time", "VLAST", "Vladivostok Time",
                "VLAT" } }, { "Asia/Yakutsk",
            new String[] { "Yakutsk Time", "YAKT", "Yakutsk Summer Time", "YAKST", "Yakutsk Time", "YAKT" } },
            { "Asia/Yekaterinburg",
                new String[] { "Yekaterinburg Time", "YEKT", "Yekaterinburg Summer Time", "YEKST", "Yekaterinburg Time",
                    "YEKT" } }, { "Asia/Yerevan", ARMT }, { "Atlantic/Azores",
            new String[] { "Azores Time", "AZOT", "Azores Summer Time", "AZOST", "Azores Time", "AZOT" } },
            { "Atlantic/Bermuda", AST }, { "Atlantic/Canary", WET }, { "Atlantic/Cape_Verde",
            new String[] { "Cape Verde Time", "CVT", "Cape Verde Summer Time", "CVST", "Cape Verde Time", "CVT" } },
            { "Atlantic/Faeroe", WET }, { "Atlantic/Faroe", WET }, { "Atlantic/Jan_Mayen", CET },
            { "Atlantic/Madeira", WET }, { "Atlantic/Reykjavik", GMT }, { "Atlantic/South_Georgia",
            new String[] { "South Georgia Standard Time", "GST", "South Georgia Daylight Time", "GDT",
                "South Georgia Time", "GT" } }, { "Atlantic/St_Helena", GMT }, { "Atlantic/Stanley",
            new String[] { "Falkland Is. Time", "FKT", "Falkland Is. Summer Time", "FKST", "Falkland Is. Time",
                "FKT" } }, { "Australia/ACT", EST_NSW }, { "Australia/Adelaide", ADELAIDE },
            { "Australia/Brisbane", BRISBANE }, { "Australia/Broken_Hill", BROKEN_HILL },
            { "Australia/Canberra", EST_NSW }, { "Australia/Currie", EST_NSW }, { "Australia/Darwin", DARWIN },
            { "Australia/Eucla", new String[] { "Central Western Standard Time (Australia)", "CWST",
                "Central Western Summer Time (Australia)", "CWST", "Central Western Time (Australia)", "CWT" } },
            { "Australia/Hobart", TASMANIA }, { "Australia/LHI", LORD_HOWE }, { "Australia/Lindeman", BRISBANE },
            { "Australia/Lord_Howe", LORD_HOWE }, { "Australia/Melbourne", VICTORIA }, { "Australia/North", DARWIN },
            { "Australia/NSW", EST_NSW }, { "Australia/Perth", WST_AUS }, { "Australia/Queensland", BRISBANE },
            { "Australia/South", ADELAIDE }, { "Australia/Sydney", EST_NSW }, { "Australia/Tasmania", TASMANIA },
            { "Australia/Victoria", VICTORIA }, { "Australia/West", WST_AUS }, { "Australia/Yancowinna", BROKEN_HILL },
            { "BET", BRT }, { "BST", BDT }, { "Brazil/Acre", ACT }, { "Brazil/DeNoronha", NORONHA },
            { "Brazil/East", BRT }, { "Brazil/West", AMT }, { "Canada/Atlantic", AST }, { "Canada/Central", CST },
            { "Canada/East-Saskatchewan", CST }, { "Canada/Eastern", EST }, { "Canada/Mountain", MST },
            { "Canada/Newfoundland", NST }, { "Canada/Pacific", PST }, { "Canada/Yukon", PST },
            { "Canada/Saskatchewan", CST }, { "CAT", CAT }, { "CET", CET }, { "Chile/Continental", CLT },
            { "Chile/EasterIsland", EASTER }, { "CST6CDT", CST }, { "Cuba", CUBA }, { "EAT", EAT }, { "EET", EET },
            { "Egypt", EET }, { "Eire", DUBLIN }, { "EST5EDT", EST }, { "Etc/Greenwich", GMT }, { "Etc/UCT", UTC },
            { "Etc/Universal", UTC }, { "Etc/UTC", UTC }, { "Etc/Zulu", UTC }, { "Europe/Amsterdam", CET },
            { "Europe/Andorra", CET }, { "Europe/Athens", EET }, { "Europe/Belfast", GMTBST },
            { "Europe/Belgrade", CET }, { "Europe/Berlin", CET }, { "Europe/Bratislava", CET },
            { "Europe/Brussels", CET }, { "Europe/Budapest", CET }, { "Europe/Busingen", CET },
            { "Europe/Chisinau", EET }, { "Europe/Copenhagen", CET }, { "Europe/Dublin", DUBLIN },
            { "Europe/Gibraltar", CET }, { "Europe/Guernsey", GMTBST }, { "Europe/Helsinki", EET },
            { "Europe/Isle_of_Man", GMTBST }, { "Europe/Istanbul", EET }, { "Europe/Jersey", GMTBST },
            { "Europe/Kaliningrad", FET }, { "Europe/Kiev", EET }, { "Europe/Lisbon", WET },
            { "Europe/Ljubljana", CET }, { "Europe/London", GMTBST }, { "Europe/Luxembourg", CET },
            { "Europe/Madrid", CET }, { "Europe/Malta", CET }, { "Europe/Mariehamn", EET }, { "Europe/Minsk", FET },
            { "Europe/Monaco", CET }, { "Europe/Moscow", MSK }, { "Europe/Nicosia", EET }, { "Europe/Oslo", CET },
            { "Europe/Podgorica", CET }, { "Europe/Prague", CET }, { "Europe/Riga", EET }, { "Europe/Rome", CET },
            { "Europe/Samara",
                new String[] { "Samara Time", "SAMT", "Samara Summer Time", "SAMST", "Samara Time", "SAMT" } },
            { "Europe/San_Marino", CET }, { "Europe/Sarajevo", CET }, { "Europe/Simferopol", EET },
            { "Europe/Skopje", CET }, { "Europe/Sofia", EET }, { "Europe/Stockholm", CET }, { "Europe/Tallinn", EET },
            { "Europe/Tirane", CET }, { "Europe/Tiraspol", EET }, { "Europe/Uzhgorod", EET }, { "Europe/Vaduz", CET },
            { "Europe/Vatican", CET }, { "Europe/Vienna", CET }, { "Europe/Vilnius", EET }, { "Europe/Volgograd",
            new String[] { "Volgograd Time", "VOLT", "Volgograd Summer Time", "VOLST", "Volgograd Time", "VOLT" } },
            { "Europe/Warsaw", CET }, { "Europe/Zagreb", CET }, { "Europe/Zaporozhye", EET }, { "Europe/Zurich", CET },
            { "GB", GMTBST }, { "GB-Eire", GMTBST }, { "Greenwich", GMT }, { "Hongkong", HKT }, { "Iceland", GMT },
            { "Iran", IRT }, { "IST", IST }, { "Indian/Antananarivo", EAT }, { "Indian/Chagos",
            new String[] { "Indian Ocean Territory Time", "IOT", "Indian Ocean Territory Summer Time", "IOST",
                "Indian Ocean Territory Time", "IOT" } }, { "Indian/Christmas",
            new String[] { "Christmas Island Time", "CXT", "Christmas Island Summer Time", "CXST",
                "Christmas Island Time", "CIT" } }, { "Indian/Cocos",
            new String[] { "Cocos Islands Time", "CCT", "Cocos Islands Summer Time", "CCST", "Cocos Islands Time",
                "CCT" } }, { "Indian/Comoro", EAT }, { "Indian/Kerguelen",
            new String[] { "French Southern & Antarctic Lands Time", "TFT",
                "French Southern & Antarctic Lands Summer Time", "TFST", "French Southern & Antarctic Lands Time",
                "TFT" } }, { "Indian/Mahe",
            new String[] { "Seychelles Time", "SCT", "Seychelles Summer Time", "SCST", "Seychelles Time", "SCT" } },
            { "Indian/Maldives",
                new String[] { "Maldives Time", "MVT", "Maldives Summer Time", "MVST", "Maldives Time", "MVT" } },
            { "Indian/Mauritius",
                new String[] { "Mauritius Time", "MUT", "Mauritius Summer Time", "MUST", "Mauritius Time", "MUT" } },
            { "Indian/Mayotte", EAT }, { "Indian/Reunion",
            new String[] { "Reunion Time", "RET", "Reunion Summer Time", "REST", "Reunion Time", "RET" } },
            { "Israel", ISRAEL }, { "Jamaica", EST }, { "Japan", JST }, { "Kwajalein", MHT }, { "Libya", EET }, { "MET",
            new String[] { "Middle Europe Time", "MET", "Middle Europe Summer Time", "MEST", "Middle Europe Time",
                "MET" } }, { "Mexico/BajaNorte", PST }, { "Mexico/BajaSur", MST }, { "Mexico/General", CST },
            { "MIT", WST_SAMOA }, { "MST7MDT", MST }, { "Navajo", MST }, { "NET", ARMT }, { "NST", NZST },
            { "NZ", NZST }, { "NZ-CHAT", CHAST }, { "PLT", PKT }, { "Portugal", WET }, { "PRT", AST },
            { "Pacific/Apia", WST_SAMOA }, { "Pacific/Auckland", NZST }, { "Pacific/Chatham", CHAST },
            { "Pacific/Chuuk", CHUT }, { "Pacific/Easter", EASTER }, { "Pacific/Efate",
            new String[] { "Vanuatu Time", "VUT", "Vanuatu Summer Time", "VUST", "Vanuatu Time", "VUT" } },
            { "Pacific/Enderbury",
                new String[] { "Phoenix Is. Time", "PHOT", "Phoenix Is. Summer Time", "PHOST", "Phoenix Is. Time",
                    "PHOT" } }, { "Pacific/Fakaofo",
            new String[] { "Tokelau Time", "TKT", "Tokelau Summer Time", "TKST", "Tokelau Time", "TKT" } },
            { "Pacific/Fiji", new String[] { "Fiji Time", "FJT", "Fiji Summer Time", "FJST", "Fiji Time", "FJT" } },
            { "Pacific/Funafuti",
                new String[] { "Tuvalu Time", "TVT", "Tuvalu Summer Time", "TVST", "Tuvalu Time", "TVT" } },
            { "Pacific/Galapagos",
                new String[] { "Galapagos Time", "GALT", "Galapagos Summer Time", "GALST", "Galapagos Time", "GALT" } },
            { "Pacific/Gambier", GAMBIER }, { "Pacific/Guadalcanal", SBT }, { "Pacific/Guam", ChST },
            { "Pacific/Johnston", HST }, { "Pacific/Kiritimati",
            new String[] { "Line Is. Time", "LINT", "Line Is. Summer Time", "LINST", "Line Is. Time", "LINT" } },
            { "Pacific/Kosrae",
                new String[] { "Kosrae Time", "KOST", "Kosrae Summer Time", "KOSST", "Kosrae Time", "KOST" } },
            { "Pacific/Kwajalein", MHT }, { "Pacific/Majuro", MHT }, { "Pacific/Marquesas",
            new String[] { "Marquesas Time", "MART", "Marquesas Summer Time", "MARST", "Marquesas Time", "MART" } },
            { "Pacific/Midway", SAMOA },
            { "Pacific/Nauru", new String[] { "Nauru Time", "NRT", "Nauru Summer Time", "NRST", "Nauru Time", "NRT" } },
            { "Pacific/Niue", new String[] { "Niue Time", "NUT", "Niue Summer Time", "NUST", "Niue Time", "NUT" } },
            { "Pacific/Norfolk",
                new String[] { "Norfolk Time", "NFT", "Norfolk Summer Time", "NFST", "Norfolk Time", "NFT" } },
            { "Pacific/Noumea",
                new String[] { "New Caledonia Time", "NCT", "New Caledonia Summer Time", "NCST", "New Caledonia Time",
                    "NCT" } }, { "Pacific/Pago_Pago", SAMOA },
            { "Pacific/Palau", new String[] { "Palau Time", "PWT", "Palau Summer Time", "PWST", "Palau Time", "PWT" } },
            { "Pacific/Pitcairn", PITCAIRN }, { "Pacific/Pohnpei", PONT }, { "Pacific/Ponape", PONT },
            { "Pacific/Port_Moresby",
                new String[] { "Papua New Guinea Time", "PGT", "Papua New Guinea Summer Time", "PGST",
                    "Papua New Guinea Time", "PGT" } }, { "Pacific/Rarotonga",
            new String[] { "Cook Is. Time", "CKT", "Cook Is. Summer Time", "CKHST", "Cook Is. Time", "CKT" } },
            { "Pacific/Saipan", ChST }, { "Pacific/Samoa", SAMOA }, { "Pacific/Tahiti",
            new String[] { "Tahiti Time", "TAHT", "Tahiti Summer Time", "TAHST", "Tahiti Time", "TAHT" } },
            { "Pacific/Tarawa",
                new String[] { "Gilbert Is. Time", "GILT", "Gilbert Is. Summer Time", "GILST", "Gilbert Is. Time",
                    "GILT" } }, { "Pacific/Tongatapu",
            new String[] { "Tonga Time", "TOT", "Tonga Summer Time", "TOST", "Tonga Time", "TOT" } },
            { "Pacific/Truk", CHUT },
            { "Pacific/Wake", new String[] { "Wake Time", "WAKT", "Wake Summer Time", "WAKST", "Wake Time", "WAKT" } },
            { "Pacific/Wallis", new String[] { "Wallis & Futuna Time", "WFT", "Wallis & Futuna Summer Time", "WFST",
                "Wallis & Futuna Time", "WFT" } }, { "Pacific/Yap", CHUT }, { "Poland", CET }, { "PRC", CTT },
            { "PST8PDT", PST }, { "ROK", KST }, { "Singapore", SGT }, { "SST", SBT }, { "SystemV/AST4", AST },
            { "SystemV/AST4ADT", AST }, { "SystemV/CST6", CST }, { "SystemV/CST6CDT", CST }, { "SystemV/EST5", EST },
            { "SystemV/EST5EDT", EST }, { "SystemV/HST10", HST }, { "SystemV/MST7", MST }, { "SystemV/MST7MDT", MST },
            { "SystemV/PST8", PST }, { "SystemV/PST8PDT", PST }, { "SystemV/YST9", AKST }, { "SystemV/YST9YDT", AKST },
            { "Turkey", EET }, { "UCT", UTC }, { "Universal", UTC }, { "US/Alaska", AKST }, { "US/Aleutian", HAST },
            { "US/Arizona", MST }, { "US/Central", CST }, { "US/Eastern", EST }, { "US/Hawaii", HST },
            { "US/Indiana-Starke", CST }, { "US/East-Indiana", EST }, { "US/Michigan", EST }, { "US/Mountain", MST },
            { "US/Pacific", PST }, { "US/Pacific-New", PST }, { "US/Samoa", SAMOA }, { "UTC", UTC }, { "VST", ICT },
            { "W-SU", MSK }, { "WET", WET }, { "Zulu", UTC }, };
    }
}
