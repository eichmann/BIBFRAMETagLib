package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceLanguage extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceLanguage currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceLanguage.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceLanguageIterator theInstanceLanguageIterator = (InstanceLanguageIterator)findAncestorWithClass(this, InstanceLanguageIterator.class);
			pageContext.getOut().print(theInstanceLanguageIterator.getLanguage());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for language tag ");
		}
		return SKIP_BODY;
	}
}

