package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperAccompaniesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperAccompaniesType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperAccompaniesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperAccompaniesIterator theNewspaperAccompaniesIterator = (NewspaperAccompaniesIterator)findAncestorWithClass(this, NewspaperAccompaniesIterator.class);
			pageContext.getOut().print(theNewspaperAccompaniesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

