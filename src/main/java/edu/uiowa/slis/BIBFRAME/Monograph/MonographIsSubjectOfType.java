package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographIsSubjectOfIterator theMonographIsSubjectOfIterator = (MonographIsSubjectOfIterator)findAncestorWithClass(this, MonographIsSubjectOfIterator.class);
			pageContext.getOut().print(theMonographIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

