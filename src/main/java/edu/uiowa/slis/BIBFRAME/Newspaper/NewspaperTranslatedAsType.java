package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperTranslatedAsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperTranslatedAsType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperTranslatedAsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperTranslatedAsIterator theNewspaperTranslatedAsIterator = (NewspaperTranslatedAsIterator)findAncestorWithClass(this, NewspaperTranslatedAsIterator.class);
			pageContext.getOut().print(theNewspaperTranslatedAsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

