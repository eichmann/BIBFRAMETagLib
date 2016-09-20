package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasOtherEditionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasOtherEditionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasOtherEditionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasOtherEditionInverseIterator theNewspaperHasOtherEditionInverseIterator = (NewspaperHasOtherEditionInverseIterator)findAncestorWithClass(this, NewspaperHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theNewspaperHasOtherEditionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

