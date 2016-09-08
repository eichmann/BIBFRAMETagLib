package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographSubject extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographSubject currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographSubject.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographSubjectIterator theMonographSubjectIterator = (MonographSubjectIterator)findAncestorWithClass(this, MonographSubjectIterator.class);
			pageContext.getOut().print(theMonographSubjectIterator.getSubject());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for subject tag ");
		}
		return SKIP_BODY;
	}
}

