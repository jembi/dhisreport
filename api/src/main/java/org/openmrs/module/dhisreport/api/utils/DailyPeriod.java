package org.openmrs.module.dhisreport.api.utils;

import org.joda.time.DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 */
public class DailyPeriod
    implements Period
{

    public static final String ISO_FORMAT = "yyyyMMdd";

    protected Date startDate;

    protected Date endDate;

    public DailyPeriod( Date date )
    {
        DateTime dt = new DateTime( date );
        startDate = dt.hourOfDay().withMinimumValue().toDate();
        endDate = dt.withTime( 23, 59, 59, 999 ).toDate();
    }

    @Override
    public Date getStart()
    {
        return startDate;
    }

    @Override
    public Date getEnd()
    {
        return endDate;
    }

    @Override
    public String getAsIsoString()
    {
        return new SimpleDateFormat( ISO_FORMAT ).format( getStart() );
    }
}
