package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasAbsorbedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasAbsorbedType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasAbsorbedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasAbsorbedIterator theNewspaperHasAbsorbedIterator = (NewspaperHasAbsorbedIterator)findAncestorWithClass(this, NewspaperHasAbsorbedIterator.class);
			pageContext.getOut().print(theNewspaperHasAbsorbedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

