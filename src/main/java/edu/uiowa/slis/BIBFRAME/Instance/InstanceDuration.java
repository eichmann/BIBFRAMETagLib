package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceDuration extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceDuration currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceDuration.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstanceDurationIterator theInstance = (InstanceDurationIterator)findAncestorWithClass(this, InstanceDurationIterator.class);
			pageContext.getOut().print(theInstance.getDuration());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for duration tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for duration tag ");
		}
		return SKIP_BODY;
	}
}

