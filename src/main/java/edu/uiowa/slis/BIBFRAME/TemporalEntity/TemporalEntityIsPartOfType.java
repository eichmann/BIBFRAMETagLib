package edu.uiowa.slis.BIBFRAME.TemporalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TemporalEntityIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TemporalEntityIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(TemporalEntityIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TemporalEntityIsPartOfIterator theTemporalEntityIsPartOfIterator = (TemporalEntityIsPartOfIterator)findAncestorWithClass(this, TemporalEntityIsPartOfIterator.class);
			pageContext.getOut().print(theTemporalEntityIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing TemporalEntity for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing TemporalEntity for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

