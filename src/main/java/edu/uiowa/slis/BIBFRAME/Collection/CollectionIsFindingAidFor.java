package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionIsFindingAidFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionIsFindingAidFor currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionIsFindingAidFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionIsFindingAidForIterator theCollectionIsFindingAidForIterator = (CollectionIsFindingAidForIterator)findAncestorWithClass(this, CollectionIsFindingAidForIterator.class);
			pageContext.getOut().print(theCollectionIsFindingAidForIterator.getIsFindingAidFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

