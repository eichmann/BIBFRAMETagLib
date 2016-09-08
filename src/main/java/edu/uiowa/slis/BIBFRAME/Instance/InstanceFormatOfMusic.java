package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceFormatOfMusic extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceFormatOfMusic currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceFormatOfMusic.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstanceFormatOfMusicIterator theInstance = (InstanceFormatOfMusicIterator)findAncestorWithClass(this, InstanceFormatOfMusicIterator.class);
			pageContext.getOut().print(theInstance.getFormatOfMusic());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for formatOfMusic tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for formatOfMusic tag ");
		}
		return SKIP_BODY;
	}
}

