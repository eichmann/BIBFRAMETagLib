package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographHasOriginPlaceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographHasOriginPlaceType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographHasOriginPlaceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographHasOriginPlaceIterator theMultipartMonographHasOriginPlaceIterator = (MultipartMonographHasOriginPlaceIterator)findAncestorWithClass(this, MultipartMonographHasOriginPlaceIterator.class);
			pageContext.getOut().print(theMultipartMonographHasOriginPlaceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

