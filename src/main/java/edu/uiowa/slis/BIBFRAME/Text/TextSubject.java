package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextSubject extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextSubject currentInstance = null;
	private static final Log log = LogFactory.getLog(TextSubject.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextSubjectIterator theTextSubjectIterator = (TextSubjectIterator)findAncestorWithClass(this, TextSubjectIterator.class);
			pageContext.getOut().print(theTextSubjectIterator.getSubject());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for subject tag ");
		}
		return SKIP_BODY;
	}
}

