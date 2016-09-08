package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographHasOriginPlace extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographHasOriginPlace currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographHasOriginPlace.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographHasOriginPlaceIterator theMonographHasOriginPlaceIterator = (MonographHasOriginPlaceIterator)findAncestorWithClass(this, MonographHasOriginPlaceIterator.class);
			pageContext.getOut().print(theMonographHasOriginPlaceIterator.getHasOriginPlace());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

