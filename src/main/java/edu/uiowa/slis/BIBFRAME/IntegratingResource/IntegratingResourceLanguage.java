package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceLanguage extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceLanguage currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceLanguage.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceLanguageIterator theIntegratingResourceLanguageIterator = (IntegratingResourceLanguageIterator)findAncestorWithClass(this, IntegratingResourceLanguageIterator.class);
			pageContext.getOut().print(theIntegratingResourceLanguageIterator.getLanguage());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for language tag ");
		}
		return SKIP_BODY;
	}
}

