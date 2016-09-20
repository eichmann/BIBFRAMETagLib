package edu.uiowa.slis.BIBFRAME.DdcClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DdcClassificationHasGenreInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DdcClassificationHasGenreInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DdcClassificationHasGenreInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DdcClassificationHasGenreInverseIterator theDdcClassificationHasGenreInverseIterator = (DdcClassificationHasGenreInverseIterator)findAncestorWithClass(this, DdcClassificationHasGenreInverseIterator.class);
			pageContext.getOut().print(theDdcClassificationHasGenreInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DdcClassification for hasGenre tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcClassification for hasGenre tag ");
		}
		return SKIP_BODY;
	}
}

