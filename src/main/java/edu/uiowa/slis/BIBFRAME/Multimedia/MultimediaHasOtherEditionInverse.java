package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaHasOtherEditionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaHasOtherEditionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaHasOtherEditionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaHasOtherEditionInverseIterator theMultimediaHasOtherEditionInverseIterator = (MultimediaHasOtherEditionInverseIterator)findAncestorWithClass(this, MultimediaHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theMultimediaHasOtherEditionInverseIterator.getHasOtherEditionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

