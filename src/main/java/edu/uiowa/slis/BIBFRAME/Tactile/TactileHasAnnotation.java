package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileHasAnnotation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileHasAnnotation currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileHasAnnotation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TactileHasAnnotationIterator theTactileHasAnnotationIterator = (TactileHasAnnotationIterator)findAncestorWithClass(this, TactileHasAnnotationIterator.class);
			pageContext.getOut().print(theTactileHasAnnotationIterator.getHasAnnotation());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

