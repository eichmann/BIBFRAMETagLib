package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextIsSubjectOfIterator theTextIsSubjectOfIterator = (TextIsSubjectOfIterator)findAncestorWithClass(this, TextIsSubjectOfIterator.class);
			pageContext.getOut().print(theTextIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

