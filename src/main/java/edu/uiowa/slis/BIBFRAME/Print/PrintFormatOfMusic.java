package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintFormatOfMusic extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintFormatOfMusic currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintFormatOfMusic.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrintFormatOfMusicIterator thePrint = (PrintFormatOfMusicIterator)findAncestorWithClass(this, PrintFormatOfMusicIterator.class);
			pageContext.getOut().print(thePrint.getFormatOfMusic());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for formatOfMusic tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for formatOfMusic tag ");
		}
		return SKIP_BODY;
	}
}

