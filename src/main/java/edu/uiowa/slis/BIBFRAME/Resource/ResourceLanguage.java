package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceLanguage extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceLanguage currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceLanguage.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceLanguageIterator theResourceLanguageIterator = (ResourceLanguageIterator)findAncestorWithClass(this, ResourceLanguageIterator.class);
			pageContext.getOut().print(theResourceLanguageIterator.getLanguage());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for language tag ");
		}
		return SKIP_BODY;
	}
}

