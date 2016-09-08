package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperTranslatedAs extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperTranslatedAs currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperTranslatedAs.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperTranslatedAsIterator theNewspaperTranslatedAsIterator = (NewspaperTranslatedAsIterator)findAncestorWithClass(this, NewspaperTranslatedAsIterator.class);
			pageContext.getOut().print(theNewspaperTranslatedAsIterator.getTranslatedAs());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

