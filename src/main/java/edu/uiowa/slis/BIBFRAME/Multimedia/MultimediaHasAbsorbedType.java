package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaHasAbsorbedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaHasAbsorbedType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaHasAbsorbedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaHasAbsorbedIterator theMultimediaHasAbsorbedIterator = (MultimediaHasAbsorbedIterator)findAncestorWithClass(this, MultimediaHasAbsorbedIterator.class);
			pageContext.getOut().print(theMultimediaHasAbsorbedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

