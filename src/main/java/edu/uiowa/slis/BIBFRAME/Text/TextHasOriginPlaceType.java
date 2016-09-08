package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextHasOriginPlaceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextHasOriginPlaceType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextHasOriginPlaceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextHasOriginPlaceIterator theTextHasOriginPlaceIterator = (TextHasOriginPlaceIterator)findAncestorWithClass(this, TextHasOriginPlaceIterator.class);
			pageContext.getOut().print(theTextHasOriginPlaceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

