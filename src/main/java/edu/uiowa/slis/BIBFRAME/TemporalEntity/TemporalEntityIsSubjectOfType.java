package edu.uiowa.slis.BIBFRAME.TemporalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TemporalEntityIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TemporalEntityIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(TemporalEntityIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TemporalEntityIsSubjectOfIterator theTemporalEntityIsSubjectOfIterator = (TemporalEntityIsSubjectOfIterator)findAncestorWithClass(this, TemporalEntityIsSubjectOfIterator.class);
			pageContext.getOut().print(theTemporalEntityIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing TemporalEntity for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing TemporalEntity for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

