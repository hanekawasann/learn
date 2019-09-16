/*
 * Copyright (c) 1996, 2011, Oracle and/or its affiliates. All rights reserved.
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
        String ACT[] = new String[] { "Acre Time", "ACT", "Acre Summer Time", "ACST" };
        String ADELAIDE[] = new String[] { "Central Standard Time (South Australia)", "CST",
            "Central Summer Time (South Australia)", "CST" };
        String AGT[] = new String[] { "Argentine Time", "ART", "Argentine Summer Time", "ARST" };
        String AKST[] = new String[] { "Alaska Standard Time", "AKST", "Alaska Daylight Time", "AKDT" };
        String AMT[] = new String[] { "Amazon Time", "AMT", "Amazon Summer Time", "AMST" };
        String ARAST[] = new String[] { "Arabia Standard Time", "AST", "Arabia Daylight Time", "ADT" };
        String ARMT[] = new String[] { "Armenia Time", "AMT", "Armenia Summer Time", "AMST" };
        String AST[] = new String[] { "Atlantic Standard Time", "AST", "Atlantic Daylight Time", "ADT" };
        String BDT[] = new String[] { "Bangladesh Time", "BDT", "Bangladesh Summer Time", "BDST" };
        String BRISBANE[] = new String[] { "Eastern Standard Time (Queensland)", "EST",
            "Eastern Summer Time (Queensland)", "EST" };
        String BROKEN_HILL[] = new String[] { "Central Standard Time (South Australia/New South Wales)", "CST",
            "Central Summer Time (South Australia/New South Wales)", "CST" };
        String BRT[] = new String[] { "Brasilia Time", "BRT", "Brasilia Summer Time", "BRST" };
        String BTT[] = new String[] { "Bhutan Time", "BTT", "Bhutan Summer Time", "BTST" };
        String CAT[] = new String[] { "Central African Time", "CAT", "Central African Summer Time", "CAST" };
        String CET[] = new String[] { "Central European Time", "CET", "Central European Summer Time", "CEST" };
        String CHAST[] = new String[] { "Chatham Standard Time", "CHAST", "Chatham Daylight Time", "CHADT" };
        String CHUT[] = new String[] { "Chuuk Time", "CHUT", "Chuuk Summer Time", "CHUST" };
        String CIT[] = new String[] { "Central Indonesia Time", "CIT", "Central Indonesia Summer Time", "CIST" };
        String CLT[] = new String[] { "Chile Time", "CLT", "Chile Summer Time", "CLST" };
        String CST[] = new String[] { "Central Standard Time", "CST", "Central Daylight Time", "CDT" };
        String CTT[] = new String[] { "China Standard Time", "CST", "China Daylight Time", "CDT" };
        String CUBA[] = new String[] { "Cuba Standard Time", "CST", "Cuba Daylight Time", "CDT" };
        String DARWIN[] = new String[] { "Central Standard Time (Northern Territory)", "CST",
            "Central Summer Time (Northern Territory)", "CST" };
        String DUBLIN[] = new String[] { "Greenwich Mean Time", "GMT", "Irish Summer Time", "IST" };
        String EAT[] = new String[] { "Eastern African Time", "EAT", "Eastern African Summer Time", "EAST" };
        String EASTER[] = new String[] { "Easter Is. Time", "EAST", "Easter Is. Summer Time", "EASST" };
        String EET[] = new String[] { "Eastern European Time", "EET", "Eastern European Summer Time", "EEST" };
        String EGT[] = new String[] { "Eastern Greenland Time", "EGT", "Eastern Greenland Summer Time", "EGST" };
        String EST[] = new String[] { "Eastern Standard Time", "EST", "Eastern Daylight Time", "EDT" };
        String EST_NSW[] = new String[] { "Eastern Standard Time (New South Wales)", "EST",
            "Eastern Summer Time (New South Wales)", "EST" };
        String GHMT[] = new String[] { "Ghana Mean Time", "GMT", "Ghana Summer Time", "GHST" };
        String GAMBIER[] = new String[] { "Gambier Time", "GAMT", "Gambier Summer Time", "GAMST" };
        String GMT[] = new String[] { "Greenwich Mean Time", "GMT", "Greenwich Mean Time", "GMT" };
        String GMTBST[] = new String[] { "Greenwich Mean Time", "GMT", "British Summer Time", "BST" };
        String GST[] = new String[] { "Gulf Standard Time", "GST", "Gulf Daylight Time", "GDT" };
        String HAST[] = new String[] { "Hawaii-Aleutian Standard Time", "HAST", "Hawaii-Aleutian Daylight Time",
            "HADT" };
        String HKT[] = new String[] { "Hong Kong Time", "HKT", "Hong Kong Summer Time", "HKST" };
        String HST[] = new String[] { "Hawaii Standard Time", "HST", "Hawaii Daylight Time", "HDT" };
        String ICT[] = new String[] { "Indochina Time", "ICT", "Indochina Summer Time", "ICST" };
        String IRT[] = new String[] { "Iran Standard Time", "IRST", "Iran Daylight Time", "IRDT" };
        String ISRAEL[] = new String[] { "Israel Standard Time", "IST", "Israel Daylight Time", "IDT" };
        String IST[] = new String[] { "India Standard Time", "IST", "India Daylight Time", "IDT" };
        String JST[] = new String[] { "Japan Standard Time", "JST", "Japan Daylight Time", "JDT" };
        String KST[] = new String[] { "Korea Standard Time", "KST", "Korea Daylight Time", "KDT" };
        String LORD_HOWE[] = new String[] { "Lord Howe Standard Time", "LHST", "Lord Howe Summer Time", "LHST" };
        String MHT[] = new String[] { "Marshall Islands Time", "MHT", "Marshall Islands Summer Time", "MHST" };
        String MSK[] = new String[] { "Moscow Standard Time", "MSK", "Moscow Daylight Time", "MSD" };
        String MST[] = new String[] { "Mountain Standard Time", "MST", "Mountain Daylight Time", "MDT" };
        String MYT[] = new String[] { "Malaysia Time", "MYT", "Malaysia Summer Time", "MYST" };
        String NORONHA[] = new String[] { "Fernando de Noronha Time", "FNT", "Fernando de Noronha Summer Time",
            "FNST" };
        String NOVT[] = new String[] { "Novosibirsk Time", "NOVT", "Novosibirsk Summer Time", "NOVST" };
        String NPT[] = new String[] { "Nepal Time", "NPT", "Nepal Summer Time", "NPST" };
        String NST[] = new String[] { "Newfoundland Standard Time", "NST", "Newfoundland Daylight Time", "NDT" };
        String NZST[] = new String[] { "New Zealand Standard Time", "NZST", "New Zealand Daylight Time", "NZDT" };
        String PITCAIRN[] = new String[] { "Pitcairn Standard Time", "PST", "Pitcairn Daylight Time", "PDT" };
        String PKT[] = new String[] { "Pakistan Time", "PKT", "Pakistan Summer Time", "PKST" };
        String PONT[] = new String[] { "Pohnpei Time", "PONT", "Pohnpei Summer Time", "PONST" };
        String PST[] = new String[] { "Pacific Standard Time", "PST", "Pacific Daylight Time", "PDT" };
        String RST[] = new String[] { "Eastern Standard Time", "EST", "Central Daylight Time", "CDT" };
        String SAST[] = new String[] { "South Africa Standard Time", "SAST", "South Africa Summer Time", "SAST" };
        String SBT[] = new String[] { "Solomon Is. Time", "SBT", "Solomon Is. Summer Time", "SBST" };
        String SGT[] = new String[] { "Singapore Time", "SGT", "Singapore Summer Time", "SGST" };
        String SLST[] = new String[] { "Greenwich Mean Time", "GMT", "Sierra Leone Summer Time", "SLST" };
        String TASMANIA[] = new String[] { "Eastern Standard Time (Tasmania)", "EST", "Eastern Summer Time (Tasmania)",
            "EST" };
        String TMT[] = new String[] { "Turkmenistan Time", "TMT", "Turkmenistan Summer Time", "TMST" };
        String ULAT[] = new String[] { "Ulaanbaatar Time", "ULAT", "Ulaanbaatar Summer Time", "ULAST" };
        String WART[] = new String[] { "Western Argentine Time", "WART", "Western Argentine Summer Time", "WARST" };
        String WAT[] = new String[] { "Western African Time", "WAT", "Western African Summer Time", "WAST" };
        String WET[] = new String[] { "Western European Time", "WET", "Western European Summer Time", "WEST" };
        String WIT[] = new String[] { "West Indonesia Time", "WIT", "West Indonesia Summer Time", "WIST" };
        String WST_AUS[] = new String[] { "Western Standard Time (Australia)", "WST", "Western Summer Time (Australia)",
            "WST" };
        String SAMOA[] = new String[] { "Samoa Standard Time", "SST", "Samoa Daylight Time", "SDT" };
        String WST_SAMOA[] = new String[] { "West Samoa Time", "WST", "West Samoa Summer Time", "WSST" };
        String ChST[] = new String[] { "Chamorro Standard Time", "ChST", "Chamorro Daylight Time", "ChDT" };
        String VICTORIA[] = new String[] { "Eastern Standard Time (Victoria)", "EST", "Eastern Summer Time (Victoria)",
            "EST" };
        String UTC[] = new String[] { "Coordinated Universal Time", "UTC", "Coordinated Universal Time", "UTC" };
        String UZT[] = new String[] { "Uzbekistan Time", "UZT", "Uzbekistan Summer Time", "UZST" };

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
            { "Africa/Harare", CAT }, { "Africa/Johannesburg", SAST }, { "Africa/Kampala", EAT },
            { "Africa/Khartoum", EAT }, { "Africa/Kigali", CAT }, { "Africa/Kinshasa", WAT }, { "Africa/Lagos", WAT },
            { "Africa/Libreville", WAT }, { "Africa/Lome", GMT }, { "Africa/Luanda", WAT },
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
            { "America/Argentina/San_Juan", AGT }, { "America/Argentina/San_Luis", WART },
            { "America/Argentina/Tucuman", AGT }, { "America/Argentina/Ushuaia", AGT }, { "America/Aruba", AST },
            { "America/Asuncion", new String[] { "Paraguay Time", "PYT", "Paraguay Summer Time", "PYST" } },
            { "America/Atikokan", EST }, { "America/Atka", HAST }, { "America/Bahia", BRT },
            { "America/Bahia_Banderas", CST }, { "America/Barbados", AST }, { "America/Belem", BRT },
            { "America/Belize", CST }, { "America/Blanc-Sablon", AST }, { "America/Boa_Vista", AMT },
            { "America/Bogota", new String[] { "Colombia Time", "COT", "Colombia Summer Time", "COST" } },
            { "America/Boise", MST }, { "America/Buenos_Aires", AGT }, { "America/Cambridge_Bay", MST },
            { "America/Campo_Grande", AMT }, { "America/Cancun", CST },
            { "America/Caracas", new String[] { "Venezuela Time", "VET", "Venezuela Summer Time", "VEST" } },
            { "America/Catamarca", AGT },
            { "America/Cayenne", new String[] { "French Guiana Time", "GFT", "French Guiana Summer Time", "GFST" } },
            { "America/Cayman", EST }, { "America/Chihuahua", MST }, { "America/Coral_Harbour", EST },
            { "America/Cordoba", AGT }, { "America/Costa_Rica", CST }, { "America/Cuiaba", AMT },
            { "America/Curacao", AST }, { "America/Danmarkshavn", GMT }, { "America/Dawson", PST },
            { "America/Dawson_Creek", MST }, { "America/Detroit", EST }, { "America/Dominica", AST },
            { "America/Edmonton", MST }, { "America/Eirunepe", AMT }, { "America/El_Salvador", CST },
            { "America/Ensenada", PST }, { "America/Fort_Wayne", EST }, { "America/Fortaleza", BRT },
            { "America/Glace_Bay", AST }, { "America/Godthab",
            new String[] { "Western Greenland Time", "WGT", "Western Greenland Summer Time", "WGST" } },
            { "America/Goose_Bay", AST }, { "America/Grand_Turk", EST }, { "America/Grenada", AST },
            { "America/Guadeloupe", AST }, { "America/Guatemala", CST },
            { "America/Guayaquil", new String[] { "Ecuador Time", "ECT", "Ecuador Summer Time", "ECST" } },
            { "America/Guyana", new String[] { "Guyana Time", "GYT", "Guyana Summer Time", "GYST" } },
            { "America/Havana", CUBA }, { "America/Hermosillo", MST }, { "America/Indiana/Indianapolis", EST },
            { "America/Indiana/Knox", CST }, { "America/Indiana/Marengo", EST }, { "America/Indiana/Petersburg", EST },
            { "America/Indiana/Tell_City", CST }, { "America/Indiana/Vevay", EST },
            { "America/Indiana/Vincennes", EST }, { "America/Indiana/Winamac", EST }, { "America/Inuvik", MST },
            { "America/Iqaluit", EST }, { "America/Jamaica", EST }, { "America/Jujuy", AGT },
            { "America/Juneau", AKST }, { "America/Kentucky/Louisville", EST }, { "America/Kentucky/Monticello", EST },
            { "America/Knox_IN", CST },
            { "America/La_Paz", new String[] { "Bolivia Time", "BOT", "Bolivia Summer Time", "BOST" } },
            { "America/Lima", new String[] { "Peru Time", "PET", "Peru Summer Time", "PEST" } },
            { "America/Louisville", EST }, { "America/Maceio", BRT }, { "America/Managua", CST },
            { "America/Manaus", AMT }, { "America/Marigot", AST }, { "America/Martinique", AST },
            { "America/Matamoros", CST }, { "America/Mazatlan", MST }, { "America/Mendoza", AGT },
            { "America/Menominee", CST }, { "America/Merida", CST }, { "America/Metlakatla",
            new String[] { "Metlakatla Standard Time", "MeST", "Metlakatla Daylight Time", "MeDT" } },
            { "America/Mexico_City", CST }, { "America/Miquelon",
            new String[] { "Pierre & Miquelon Standard Time", "PMST", "Pierre & Miquelon Daylight Time", "PMDT" } },
            { "America/Moncton", AST },
            { "America/Montevideo", new String[] { "Uruguay Time", "UYT", "Uruguay Summer Time", "UYST" } },
            { "America/Monterrey", CST }, { "America/Montreal", EST }, { "America/Montserrat", AST },
            { "America/Nassau", EST }, { "America/Nipigon", EST }, { "America/Nome", AKST },
            { "America/Noronha", NORONHA }, { "America/North_Dakota/Beulah", CST },
            { "America/North_Dakota/Center", CST }, { "America/North_Dakota/New_Salem", CST },
            { "America/Ojinaga", MST }, { "America/Panama", EST }, { "America/Pangnirtung", EST },
            { "America/Paramaribo", new String[] { "Suriname Time", "SRT", "Suriname Summer Time", "SRST" } },
            { "America/Port-au-Prince", EST }, { "America/Port_of_Spain", AST }, { "America/Porto_Acre", AMT },
            { "America/Porto_Velho", AMT }, { "America/Puerto_Rico", AST }, { "America/Rainy_River", CST },
            { "America/Rankin_Inlet", CST }, { "America/Recife", BRT }, { "America/Regina", CST },
            { "America/Resolute", RST }, { "America/Rio_Branco", AMT }, { "America/Rosario", AGT },
            { "America/Santa_Isabel", PST }, { "America/Santarem", BRT }, { "America/Santiago", CLT },
            { "America/Santo_Domingo", AST }, { "America/Sao_Paulo", BRT }, { "America/Scoresbysund", EGT },
            { "America/Shiprock", MST }, { "America/St_Barthelemy", AST }, { "America/St_Kitts", AST },
            { "America/St_Lucia", AST }, { "America/St_Thomas", AST }, { "America/St_Vincent", AST },
            { "America/Swift_Current", CST }, { "America/Tegucigalpa", CST }, { "America/Thule", AST },
            { "America/Thunder_Bay", EST }, { "America/Tijuana", PST }, { "America/Toronto", EST },
            { "America/Tortola", AST }, { "America/Vancouver", PST }, { "America/Virgin", AST },
            { "America/Whitehorse", PST }, { "America/Winnipeg", CST }, { "America/Yakutat", AKST },
            { "America/Yellowknife", MST }, { "Antarctica/Casey", WST_AUS },
            { "Antarctica/Davis", new String[] { "Davis Time", "DAVT", "Davis Summer Time", "DAVST" } },
            { "Antarctica/DumontDUrville",
                new String[] { "Dumont-d'Urville Time", "DDUT", "Dumont-d'Urville Summer Time", "DDUST" } },
            { "Antarctica/Macquarie",
                new String[] { "Macquarie Island Time", "MIST", "Macquarie Island Summer Time", "MIST" } },
            { "Antarctica/Mawson", new String[] { "Mawson Time", "MAWT", "Mawson Summer Time", "MAWST" } },
            { "Antarctica/McMurdo", NZST }, { "Antarctica/Palmer", CLT },
            { "Antarctica/Rothera", new String[] { "Rothera Time", "ROTT", "Rothera Summer Time", "ROTST" } },
            { "Antarctica/South_Pole", NZST },
            { "Antarctica/Syowa", new String[] { "Syowa Time", "SYOT", "Syowa Summer Time", "SYOST" } },
            { "Antarctica/Vostok", new String[] { "Vostok Time", "VOST", "Vostok Summer Time", "VOSST" } },
            { "Arctic/Longyearbyen", CET }, { "Asia/Aden", ARAST },
            { "Asia/Almaty", new String[] { "Alma-Ata Time", "ALMT", "Alma-Ata Summer Time", "ALMST" } },
            { "Asia/Amman", EET },
            { "Asia/Anadyr", new String[] { "Anadyr Time", "ANAT", "Anadyr Summer Time", "ANAST" } },
            { "Asia/Aqtau", new String[] { "Aqtau Time", "AQTT", "Aqtau Summer Time", "AQTST" } },
            { "Asia/Aqtobe", new String[] { "Aqtobe Time", "AQTT", "Aqtobe Summer Time", "AQTST" } },
            { "Asia/Ashgabat", TMT }, { "Asia/Ashkhabad", TMT }, { "Asia/Baghdad", ARAST }, { "Asia/Bahrain", ARAST },
            { "Asia/Baku", new String[] { "Azerbaijan Time", "AZT", "Azerbaijan Summer Time", "AZST" } },
            { "Asia/Bangkok", ICT }, { "Asia/Beirut", EET },
            { "Asia/Bishkek", new String[] { "Kirgizstan Time", "KGT", "Kirgizstan Summer Time", "KGST" } },
            { "Asia/Brunei", new String[] { "Brunei Time", "BNT", "Brunei Summer Time", "BNST" } },
            { "Asia/Calcutta", IST },
            { "Asia/Choibalsan", new String[] { "Choibalsan Time", "CHOT", "Choibalsan Summer Time", "CHOST" } },
            { "Asia/Chongqing", CTT }, { "Asia/Chungking", CTT }, { "Asia/Colombo", IST }, { "Asia/Dacca", BDT },
            { "Asia/Dhaka", BDT },
            { "Asia/Dili", new String[] { "Timor-Leste Time", "TLT", "Timor-Leste Summer Time", "TLST" } },
            { "Asia/Damascus", EET }, { "Asia/Dubai", GST },
            { "Asia/Dushanbe", new String[] { "Tajikistan Time", "TJT", "Tajikistan Summer Time", "TJST" } },
            { "Asia/Gaza", EET }, { "Asia/Harbin", CTT }, { "Asia/Ho_Chi_Minh", ICT }, { "Asia/Hong_Kong", HKT },
            { "Asia/Hovd", new String[] { "Hovd Time", "HOVT", "Hovd Summer Time", "HOVST" } },
            { "Asia/Irkutsk", new String[] { "Irkutsk Time", "IRKT", "Irkutsk Summer Time", "IRKST" } },
            { "Asia/Istanbul", EET }, { "Asia/Jakarta", WIT },
            { "Asia/Jayapura", new String[] { "East Indonesia Time", "EIT", "East Indonesia Summer Time", "EIST" } },
            { "Asia/Kabul", new String[] { "Afghanistan Time", "AFT", "Afghanistan Summer Time", "AFST" } },
            { "Asia/Kamchatka",
                new String[] { "Petropavlovsk-Kamchatski Time", "PETT", "Petropavlovsk-Kamchatski Summer Time",
                    "PETST" } }, { "Asia/Karachi", PKT }, { "Asia/Kashgar", CTT }, { "Asia/Kathmandu", NPT },
            { "Asia/Katmandu", NPT }, { "Asia/Kolkata", IST },
            { "Asia/Krasnoyarsk", new String[] { "Krasnoyarsk Time", "KRAT", "Krasnoyarsk Summer Time", "KRAST" } },
            { "Asia/Kuala_Lumpur", MYT }, { "Asia/Kuching", MYT }, { "Asia/Kuwait", ARAST }, { "Asia/Macao", CTT },
            { "Asia/Macau", CTT },
            { "Asia/Magadan", new String[] { "Magadan Time", "MAGT", "Magadan Summer Time", "MAGST" } },
            { "Asia/Makassar", CIT },
            { "Asia/Manila", new String[] { "Philippines Time", "PHT", "Philippines Summer Time", "PHST" } },
            { "Asia/Muscat", GST }, { "Asia/Nicosia", EET }, { "Asia/Novokuznetsk", NOVT },
            { "Asia/Novosibirsk", NOVT },
            { "Asia/Oral", new String[] { "Oral Time", "ORAT", "Oral Summer Time", "ORAST" } },
            { "Asia/Omsk", new String[] { "Omsk Time", "OMST", "Omsk Summer Time", "OMSST" } },
            { "Asia/Phnom_Penh", ICT }, { "Asia/Pontianak", WIT }, { "Asia/Pyongyang", KST }, { "Asia/Qatar", ARAST },
            { "Asia/Qyzylorda", new String[] { "Qyzylorda Time", "QYZT", "Qyzylorda Summer Time", "QYZST" } },
            { "Asia/Rangoon", new String[] { "Myanmar Time", "MMT", "Myanmar Summer Time", "MMST" } },
            { "Asia/Riyadh", ARAST }, { "Asia/Saigon", ICT },
            { "Asia/Sakhalin", new String[] { "Sakhalin Time", "SAKT", "Sakhalin Summer Time", "SAKST" } },
            { "Asia/Samarkand", UZT }, { "Asia/Seoul", KST }, { "Asia/Singapore", SGT }, { "Asia/Taipei", CTT },
            { "Asia/Tel_Aviv", ISRAEL }, { "Asia/Tashkent", UZT },
            { "Asia/Tbilisi", new String[] { "Georgia Time", "GET", "Georgia Summer Time", "GEST" } },
            { "Asia/Tehran", IRT }, { "Asia/Thimbu", BTT }, { "Asia/Thimphu", BTT }, { "Asia/Ujung_Pandang", CIT },
            { "Asia/Ulaanbaatar", ULAT }, { "Asia/Ulan_Bator", ULAT }, { "Asia/Urumqi", CTT },
            { "Asia/Vientiane", ICT },
            { "Asia/Vladivostok", new String[] { "Vladivostok Time", "VLAT", "Vladivostok Summer Time", "VLAST" } },
            { "Asia/Yakutsk", new String[] { "Yakutsk Time", "YAKT", "Yakutsk Summer Time", "YAKST" } },
            { "Asia/Yekaterinburg",
                new String[] { "Yekaterinburg Time", "YEKT", "Yekaterinburg Summer Time", "YEKST" } },
            { "Asia/Yerevan", ARMT },
            { "Atlantic/Azores", new String[] { "Azores Time", "AZOT", "Azores Summer Time", "AZOST" } },
            { "Atlantic/Bermuda", AST }, { "Atlantic/Canary", WET },
            { "Atlantic/Cape_Verde", new String[] { "Cape Verde Time", "CVT", "Cape Verde Summer Time", "CVST" } },
            { "Atlantic/Faeroe", WET }, { "Atlantic/Faroe", WET }, { "Atlantic/Jan_Mayen", CET },
            { "Atlantic/Madeira", WET }, { "Atlantic/Reykjavik", GMT }, { "Atlantic/South_Georgia",
            new String[] { "South Georgia Standard Time", "GST", "South Georgia Daylight Time", "GDT" } },
            { "Atlantic/St_Helena", GMT },
            { "Atlantic/Stanley", new String[] { "Falkland Is. Time", "FKT", "Falkland Is. Summer Time", "FKST" } },
            { "Australia/ACT", EST_NSW }, { "Australia/Adelaide", ADELAIDE }, { "Australia/Brisbane", BRISBANE },
            { "Australia/Broken_Hill", BROKEN_HILL }, { "Australia/Canberra", EST_NSW },
            { "Australia/Currie", EST_NSW }, { "Australia/Darwin", DARWIN }, { "Australia/Eucla",
            new String[] { "Central Western Standard Time (Australia)", "CWST",
                "Central Western Summer Time (Australia)", "CWST" } }, { "Australia/Hobart", TASMANIA },
            { "Australia/LHI", LORD_HOWE }, { "Australia/Lindeman", BRISBANE }, { "Australia/Lord_Howe", LORD_HOWE },
            { "Australia/Melbourne", VICTORIA }, { "Australia/North", DARWIN }, { "Australia/NSW", EST_NSW },
            { "Australia/Perth", WST_AUS }, { "Australia/Queensland", BRISBANE }, { "Australia/South", ADELAIDE },
            { "Australia/Sydney", EST_NSW }, { "Australia/Tasmania", TASMANIA }, { "Australia/Victoria", VICTORIA },
            { "Australia/West", WST_AUS }, { "Australia/Yancowinna", BROKEN_HILL }, { "BET", BRT }, { "BST", BDT },
            { "Brazil/Acre", AMT }, { "Brazil/DeNoronha", NORONHA }, { "Brazil/East", BRT }, { "Brazil/West", AMT },
            { "Canada/Atlantic", AST }, { "Canada/Central", CST }, { "Canada/East-Saskatchewan", CST },
            { "Canada/Eastern", EST }, { "Canada/Mountain", MST }, { "Canada/Newfoundland", NST },
            { "Canada/Pacific", PST }, { "Canada/Yukon", PST }, { "Canada/Saskatchewan", CST }, { "CAT", CAT },
            { "CET", CET }, { "Chile/Continental", CLT }, { "Chile/EasterIsland", EASTER }, { "CST6CDT", CST },
            { "Cuba", CUBA }, { "EAT", EAT }, { "EET", EET }, { "Egypt", EET }, { "Eire", DUBLIN }, { "EST5EDT", EST },
            { "Etc/Greenwich", GMT }, { "Etc/UCT", UTC }, { "Etc/Universal", UTC }, { "Etc/UTC", UTC },
            { "Etc/Zulu", UTC }, { "Europe/Amsterdam", CET }, { "Europe/Andorra", CET }, { "Europe/Athens", EET },
            { "Europe/Belfast", GMTBST }, { "Europe/Belgrade", CET }, { "Europe/Berlin", CET },
            { "Europe/Bratislava", CET }, { "Europe/Brussels", CET }, { "Europe/Budapest", CET },
            { "Europe/Chisinau", EET }, { "Europe/Copenhagen", CET }, { "Europe/Dublin", DUBLIN },
            { "Europe/Gibraltar", CET }, { "Europe/Guernsey", GMTBST }, { "Europe/Helsinki", EET },
            { "Europe/Isle_of_Man", GMTBST }, { "Europe/Istanbul", EET }, { "Europe/Jersey", GMTBST },
            { "Europe/Kaliningrad", EET }, { "Europe/Kiev", EET }, { "Europe/Lisbon", WET },
            { "Europe/Ljubljana", CET }, { "Europe/London", GMTBST }, { "Europe/Luxembourg", CET },
            { "Europe/Madrid", CET }, { "Europe/Malta", CET }, { "Europe/Mariehamn", EET }, { "Europe/Minsk", EET },
            { "Europe/Monaco", CET }, { "Europe/Moscow", MSK }, { "Europe/Nicosia", EET }, { "Europe/Oslo", CET },
            { "Europe/Podgorica", CET }, { "Europe/Prague", CET }, { "Europe/Riga", EET }, { "Europe/Rome", CET },
            { "Europe/Samara", new String[] { "Samara Time", "SAMT", "Samara Summer Time", "SAMST" } },
            { "Europe/San_Marino", CET }, { "Europe/Sarajevo", CET }, { "Europe/Simferopol", EET },
            { "Europe/Skopje", CET }, { "Europe/Sofia", EET }, { "Europe/Stockholm", CET }, { "Europe/Tallinn", EET },
            { "Europe/Tirane", CET }, { "Europe/Tiraspol", EET }, { "Europe/Uzhgorod", EET }, { "Europe/Vaduz", CET },
            { "Europe/Vatican", CET }, { "Europe/Vienna", CET }, { "Europe/Vilnius", EET },
            { "Europe/Volgograd", new String[] { "Volgograd Time", "VOLT", "Volgograd Summer Time", "VOLST" } },
            { "Europe/Warsaw", CET }, { "Europe/Zagreb", CET }, { "Europe/Zaporozhye", EET }, { "Europe/Zurich", CET },
            { "GB", GMTBST }, { "GB-Eire", GMTBST }, { "Greenwich", GMT }, { "Hongkong", HKT }, { "Iceland", GMT },
            { "Iran", IRT }, { "IST", IST }, { "Indian/Antananarivo", EAT }, { "Indian/Chagos",
            new String[] { "Indian Ocean Territory Time", "IOT", "Indian Ocean Territory Summer Time", "IOST" } },
            { "Indian/Christmas",
                new String[] { "Christmas Island Time", "CXT", "Christmas Island Summer Time", "CXST" } },
            { "Indian/Cocos", new String[] { "Cocos Islands Time", "CCT", "Cocos Islands Summer Time", "CCST" } },
            { "Indian/Comoro", EAT }, { "Indian/Kerguelen",
            new String[] { "French Southern & Antarctic Lands Time", "TFT",
                "French Southern & Antarctic Lands Summer Time", "TFST" } },
            { "Indian/Mahe", new String[] { "Seychelles Time", "SCT", "Seychelles Summer Time", "SCST" } },
            { "Indian/Maldives", new String[] { "Maldives Time", "MVT", "Maldives Summer Time", "MVST" } },
            { "Indian/Mauritius", new String[] { "Mauritius Time", "MUT", "Mauritius Summer Time", "MUST" } },
            { "Indian/Mayotte", EAT },
            { "Indian/Reunion", new String[] { "Reunion Time", "RET", "Reunion Summer Time", "REST" } },
            { "Israel", ISRAEL }, { "Jamaica", EST }, { "Japan", JST }, { "Kwajalein", MHT }, { "Libya", EET },
            { "MET", new String[] { "Middle Europe Time", "MET", "Middle Europe Summer Time", "MEST" } },
            { "Mexico/BajaNorte", PST }, { "Mexico/BajaSur", MST }, { "Mexico/General", CST }, { "MIT", WST_SAMOA },
            { "MST7MDT", MST }, { "Navajo", MST }, { "NET", ARMT }, { "NST", NZST }, { "NZ", NZST },
            { "NZ-CHAT", CHAST }, { "PLT", PKT }, { "Portugal", WET }, { "PRT", AST }, { "Pacific/Apia", WST_SAMOA },
            { "Pacific/Auckland", NZST }, { "Pacific/Chatham", CHAST }, { "Pacific/Chuuk", CHUT },
            { "Pacific/Easter", EASTER },
            { "Pacific/Efate", new String[] { "Vanuatu Time", "VUT", "Vanuatu Summer Time", "VUST" } },
            { "Pacific/Enderbury", new String[] { "Phoenix Is. Time", "PHOT", "Phoenix Is. Summer Time", "PHOST" } },
            { "Pacific/Fakaofo", new String[] { "Tokelau Time", "TKT", "Tokelau Summer Time", "TKST" } },
            { "Pacific/Fiji", new String[] { "Fiji Time", "FJT", "Fiji Summer Time", "FJST" } },
            { "Pacific/Funafuti", new String[] { "Tuvalu Time", "TVT", "Tuvalu Summer Time", "TVST" } },
            { "Pacific/Galapagos", new String[] { "Galapagos Time", "GALT", "Galapagos Summer Time", "GALST" } },
            { "Pacific/Gambier", GAMBIER }, { "Pacific/Guadalcanal", SBT }, { "Pacific/Guam", ChST },
            { "Pacific/Johnston", HST },
            { "Pacific/Kiritimati", new String[] { "Line Is. Time", "LINT", "Line Is. Summer Time", "LINST" } },
            { "Pacific/Kosrae", new String[] { "Kosrae Time", "KOST", "Kosrae Summer Time", "KOSST" } },
            { "Pacific/Kwajalein", MHT }, { "Pacific/Majuro", MHT },
            { "Pacific/Marquesas", new String[] { "Marquesas Time", "MART", "Marquesas Summer Time", "MARST" } },
            { "Pacific/Midway", SAMOA },
            { "Pacific/Nauru", new String[] { "Nauru Time", "NRT", "Nauru Summer Time", "NRST" } },
            { "Pacific/Niue", new String[] { "Niue Time", "NUT", "Niue Summer Time", "NUST" } },
            { "Pacific/Norfolk", new String[] { "Norfolk Time", "NFT", "Norfolk Summer Time", "NFST" } },
            { "Pacific/Noumea", new String[] { "New Caledonia Time", "NCT", "New Caledonia Summer Time", "NCST" } },
            { "Pacific/Pago_Pago", SAMOA },
            { "Pacific/Palau", new String[] { "Palau Time", "PWT", "Palau Summer Time", "PWST" } },
            { "Pacific/Pitcairn", PITCAIRN }, { "Pacific/Pohnpei", PONT }, { "Pacific/Ponape", PONT },
            { "Pacific/Port_Moresby",
                new String[] { "Papua New Guinea Time", "PGT", "Papua New Guinea Summer Time", "PGST" } },
            { "Pacific/Rarotonga", new String[] { "Cook Is. Time", "CKT", "Cook Is. Summer Time", "CKHST" } },
            { "Pacific/Saipan", ChST }, { "Pacific/Samoa", SAMOA },
            { "Pacific/Tahiti", new String[] { "Tahiti Time", "TAHT", "Tahiti Summer Time", "TAHST" } },
            { "Pacific/Tarawa", new String[] { "Gilbert Is. Time", "GILT", "Gilbert Is. Summer Time", "GILST" } },
            { "Pacific/Tongatapu", new String[] { "Tonga Time", "TOT", "Tonga Summer Time", "TOST" } },
            { "Pacific/Truk", CHUT },
            { "Pacific/Wake", new String[] { "Wake Time", "WAKT", "Wake Summer Time", "WAKST" } },
            { "Pacific/Wallis", new String[] { "Wallis & Futuna Time", "WFT", "Wallis & Futuna Summer Time", "WFST" } },
            { "Pacific/Yap", CHUT }, { "Poland", CET }, { "PRC", CTT }, { "PST8PDT", PST }, { "ROK", KST },
            { "Singapore", SGT }, { "SST", SBT }, { "SystemV/AST4", AST }, { "SystemV/AST4ADT", AST },
            { "SystemV/CST6", CST }, { "SystemV/CST6CDT", CST }, { "SystemV/EST5", EST }, { "SystemV/EST5EDT", EST },
            { "SystemV/HST10", HST }, { "SystemV/MST7", MST }, { "SystemV/MST7MDT", MST }, { "SystemV/PST8", PST },
            { "SystemV/PST8PDT", PST }, { "SystemV/YST9", AKST }, { "SystemV/YST9YDT", AKST }, { "Turkey", EET },
            { "UCT", UTC }, { "Universal", UTC }, { "US/Alaska", AKST }, { "US/Aleutian", HAST }, { "US/Arizona", MST },
            { "US/Central", CST }, { "US/Eastern", EST }, { "US/Hawaii", HST }, { "US/Indiana-Starke", CST },
            { "US/East-Indiana", EST }, { "US/Michigan", EST }, { "US/Mountain", MST }, { "US/Pacific", PST },
            { "US/Pacific-New", PST }, { "US/Samoa", SAMOA }, { "UTC", UTC }, { "VST", ICT }, { "W-SU", MSK },
            { "WET", WET }, { "Zulu", UTC }, };
    }
}
