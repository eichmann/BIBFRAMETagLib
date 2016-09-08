package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaHasOriginPlaceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaHasOriginPlaceType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaHasOriginPlaceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaHasOriginPlaceIterator theMultimediaHasOriginPlaceIterator = (MultimediaHasOriginPlaceIterator)findAncestorWithClass(this, MultimediaHasOriginPlaceIterator.class);
			pageContext.getOut().print(theMultimediaHasOriginPlaceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

