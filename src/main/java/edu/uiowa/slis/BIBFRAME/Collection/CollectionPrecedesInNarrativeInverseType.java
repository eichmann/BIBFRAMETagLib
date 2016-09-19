package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionPrecedesInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionPrecedesInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionPrecedesInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionPrecedesInNarrativeInverseIterator theCollectionPrecedesInNarrativeInverseIterator = (CollectionPrecedesInNarrativeInverseIterator)findAncestorWithClass(this, CollectionPrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theCollectionPrecedesInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

