package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographIsFindingAidForType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographIsFindingAidForType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographIsFindingAidForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographIsFindingAidForIterator theMonographIsFindingAidForIterator = (MonographIsFindingAidForIterator)findAncestorWithClass(this, MonographIsFindingAidForIterator.class);
			pageContext.getOut().print(theMonographIsFindingAidForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

