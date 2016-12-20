package edu.uiowa.slis.BIBFRAME.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationLanguage extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LocationLanguage currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationLanguage.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationLanguageIterator theLocationLanguageIterator = (LocationLanguageIterator)findAncestorWithClass(this, LocationLanguageIterator.class);
			pageContext.getOut().print(theLocationLanguageIterator.getLanguage());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for language tag ");
		}
		return SKIP_BODY;
	}
}

