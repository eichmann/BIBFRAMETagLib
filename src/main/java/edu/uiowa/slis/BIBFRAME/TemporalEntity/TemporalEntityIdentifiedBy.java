package edu.uiowa.slis.BIBFRAME.TemporalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TemporalEntityIdentifiedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TemporalEntityIdentifiedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(TemporalEntityIdentifiedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TemporalEntityIdentifiedByIterator theTemporalEntityIdentifiedByIterator = (TemporalEntityIdentifiedByIterator)findAncestorWithClass(this, TemporalEntityIdentifiedByIterator.class);
			pageContext.getOut().print(theTemporalEntityIdentifiedByIterator.getIdentifiedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing TemporalEntity for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing TemporalEntity for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

