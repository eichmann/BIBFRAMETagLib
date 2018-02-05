package edu.uiowa.slis.BIBFRAME.TemporalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TemporalEntityName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TemporalEntityName currentInstance = null;
	private static final Log log = LogFactory.getLog(TemporalEntityName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TemporalEntityNameIterator theTemporalEntity = (TemporalEntityNameIterator)findAncestorWithClass(this, TemporalEntityNameIterator.class);
			pageContext.getOut().print(theTemporalEntity.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing TemporalEntity for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing TemporalEntity for name tag ");
		}
		return SKIP_BODY;
	}
}

