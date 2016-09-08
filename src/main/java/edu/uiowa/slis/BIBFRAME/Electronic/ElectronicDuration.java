package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicDuration extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicDuration currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicDuration.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ElectronicDurationIterator theElectronic = (ElectronicDurationIterator)findAncestorWithClass(this, ElectronicDurationIterator.class);
			pageContext.getOut().print(theElectronic.getDuration());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for duration tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for duration tag ");
		}
		return SKIP_BODY;
	}
}

