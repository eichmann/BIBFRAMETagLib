package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasOriginPlaceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasOriginPlaceType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasOriginPlaceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasOriginPlaceIterator theNewspaperHasOriginPlaceIterator = (NewspaperHasOriginPlaceIterator)findAncestorWithClass(this, NewspaperHasOriginPlaceIterator.class);
			pageContext.getOut().print(theNewspaperHasOriginPlaceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

