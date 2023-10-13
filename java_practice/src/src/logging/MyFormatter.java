package logging;

import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.Formatter;
import java.util.Date;

public class MyFormatter extends Formatter{

    @Override
    public String format(LogRecord  record){
        return record.getThreadID() + "::" +  record.getSourceClassName() + "::" + record.getSourceMethodName() + "::" + new Date(record.getMillis()) + "::" + record.getMessage() + "\n";

    }
}
