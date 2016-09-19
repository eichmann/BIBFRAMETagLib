package edu.uiowa.slis.BIBFRAME.RWO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RWOLanguage extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RWOLanguage currentInstance = null;
	private static final Log log = LogFactory.getLog(RWOLanguage.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RWOLanguageIterator theRWOLanguageIterator = (RWOLanguageIterator)findAncestorWithClass(this, RWOLanguageIterator.class);
			pageContext.getOut().print(theRWOLanguageIterator.getLanguage());
		} catch (Exception e) {
			log.error("Can't find enclosing RWO for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for language tag ");
		}
		return SKIP_BODY;
	}
}

