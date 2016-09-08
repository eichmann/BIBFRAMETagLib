package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasOtherEdition extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasOtherEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasOtherEdition.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasOtherEditionIterator theNewspaperHasOtherEditionIterator = (NewspaperHasOtherEditionIterator)findAncestorWithClass(this, NewspaperHasOtherEditionIterator.class);
			pageContext.getOut().print(theNewspaperHasOtherEditionIterator.getHasOtherEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

