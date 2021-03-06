package edu.uiowa.slis.BIBFRAME.TemporalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TemporalEntityPrecedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TemporalEntityPrecedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(TemporalEntityPrecedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TemporalEntityPrecedesIterator theTemporalEntityPrecedesIterator = (TemporalEntityPrecedesIterator)findAncestorWithClass(this, TemporalEntityPrecedesIterator.class);
			pageContext.getOut().print(theTemporalEntityPrecedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing TemporalEntity for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing TemporalEntity for precedes tag ");
		}
		return SKIP_BODY;
	}
}

