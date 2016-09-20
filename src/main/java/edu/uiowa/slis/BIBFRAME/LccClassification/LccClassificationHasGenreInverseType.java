package edu.uiowa.slis.BIBFRAME.LccClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LccClassificationHasGenreInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LccClassificationHasGenreInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LccClassificationHasGenreInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LccClassificationHasGenreInverseIterator theLccClassificationHasGenreInverseIterator = (LccClassificationHasGenreInverseIterator)findAncestorWithClass(this, LccClassificationHasGenreInverseIterator.class);
			pageContext.getOut().print(theLccClassificationHasGenreInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LccClassification for hasGenre tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccClassification for hasGenre tag ");
		}
		return SKIP_BODY;
	}
}

