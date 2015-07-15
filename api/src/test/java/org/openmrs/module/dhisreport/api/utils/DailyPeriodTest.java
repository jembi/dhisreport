/**
 *  Copyright 2012 Society for Health Information Systems Programmes, India (HISP India)
 *
 *  This file is part of DHIS2 Reporting module.
 *
 *  DHIS2 Reporting module is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.

 *  DHIS2 Reporting module is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with DHIS2 Reporting module.  If not, see <http://www.gnu.org/licenses/>.
 *
 **/
package org.openmrs.module.dhisreport.api.utils;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class DailyPeriodTest
{

    public DailyPeriodTest()
    {
    }

    /**
     * Test of getStart method, of class DailyPeriod.
     */
    @Test
    public void testGetStart()
        throws ParseException
    {
        DailyPeriod instance = new DailyPeriod( new SimpleDateFormat( "yyyy-MM-dd" ).parse( "2012-10-19" ) );
        Date expResult = new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss" ).parse( "2012-10-19T00:00:00" );
        Date result = instance.getStart();
        assertEquals( expResult, result );
    }

    /**
     * Test of getEnd method, of class DailyPeriod.
     */
    @Test
    public void testGetEnd()
        throws ParseException
    {
        DailyPeriod instance = new DailyPeriod( new SimpleDateFormat( "yyyy-MM-dd" ).parse( "2012-10-19" ) );
        Date expResult = new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss.SSS" ).parse( "2012-10-19T23:59:59.999" );
        Date result = instance.getEnd();
        assertEquals( expResult, result );
    }

    /**
     * Test of getAsIsoString method, of class DailyPeriod.
     */
    @Test
    public void testGetAsIsoString()
        throws ParseException
    {
        DailyPeriod instance = new DailyPeriod( new SimpleDateFormat( "yyyy-MM-dd" ).parse( "2012-10-19" ) );
        String expResult = "20121019";
        String result = instance.getAsIsoString();
        assertEquals( expResult, result );
    }
}
