/*
 * Copyright (c) 2008 by Naohide Sano, All rights reserved.
 *
 * Programmed by Naohide Sano
 */

package vavi.util.mona;

import java.io.IOException;
import java.util.List;


/**
 * BbsDataFactory. 
 *
 * @author <a href="mailto:vavivavi@yahoo.co.jp">Naohide Sano</a> (nsano)
 * @version 0.00 081221 nsano initial version <br>
 */
public interface BbsDataFactory {

    /** 
     * @param thread lastModified, size
     */
    List<BbsData> readFrom(BbsThread thread) throws IOException;
}

/* */
