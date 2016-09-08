package edu.uiowa.slis.BIBFRAME.NonSortElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonSortElementLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NonSortElementLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(NonSortElementLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NonSortElement theNonSortElement = (NonSortElement)findAncestorWithClass(this, NonSortElement.class);
			if (!theNonSortElement.commitNeeded) {
				pageContext.getOut().print(theNonSortElement.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NonSortElement for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonSortElement for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			NonSortElement theNonSortElement = (NonSortElement)findAncestorWithClass(this, NonSortElement.class);
			return theNonSortElement.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing NonSortElement for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonSortElement for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			NonSortElement theNonSortElement = (NonSortElement)findAncestorWithClass(this, NonSortElement.class);
			theNonSortElement.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing NonSortElement for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonSortElement for label tag ");
		}
	}
}

