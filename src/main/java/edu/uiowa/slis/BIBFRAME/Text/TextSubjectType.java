package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextSubjectType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextSubjectType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextSubjectType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextSubjectIterator theTextSubjectIterator = (TextSubjectIterator)findAncestorWithClass(this, TextSubjectIterator.class);
			pageContext.getOut().print(theTextSubjectIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for subject tag ");
		}
		return SKIP_BODY;
	}
}

