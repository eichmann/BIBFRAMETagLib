package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographHasOriginPlaceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographHasOriginPlaceType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographHasOriginPlaceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographHasOriginPlaceIterator theMonographHasOriginPlaceIterator = (MonographHasOriginPlaceIterator)findAncestorWithClass(this, MonographHasOriginPlaceIterator.class);
			pageContext.getOut().print(theMonographHasOriginPlaceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

