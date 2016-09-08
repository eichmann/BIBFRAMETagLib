package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperTranslatesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperTranslatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperTranslatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperTranslatesIterator theNewspaperTranslatesIterator = (NewspaperTranslatesIterator)findAncestorWithClass(this, NewspaperTranslatesIterator.class);
			pageContext.getOut().print(theNewspaperTranslatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for translates tag ");
		}
		return SKIP_BODY;
	}
}

